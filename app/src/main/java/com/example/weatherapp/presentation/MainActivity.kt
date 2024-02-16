package com.example.weatherapp.presentation

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.ActivityResultRegistryOwner
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.weatherapp.presentation.screens.MainScreen
import com.example.weatherapp.presentation.screens.MainScreenViewModel
import com.example.weatherapp.presentation.theme.WeatherAppTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.UUID

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: MainScreenViewModel = hiltViewModel()
                    MainScreen(viewModel = viewModel)

                }

            }
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun <I, O> registerForActivityResult(
    contract: ActivityResultContract<I, O>,
    onResult: (O) -> Unit
): ActivityResultLauncher<I> {
    val owner = LocalContext.current as ActivityResultRegistryOwner
    val activityResultRegistry = owner.activityResultRegistry
    val currentOnResult = rememberUpdatedState(onResult)
    val key = rememberSaveable { UUID.randomUUID().toString() }
    val realLauncher = mutableStateOf<ActivityResultLauncher<I>?>(null)
    val returnedLauncher = remember {
        object : ActivityResultLauncher<I>() {
            override fun launch(input: I, options: ActivityOptionsCompat?) {
                realLauncher.value?.launch(input, options)
            }

            override fun unregister() {
                realLauncher.value?.unregister()
            }

            override fun getContract() = contract
        }
    }
    DisposableEffect(activityResultRegistry, key, contract) {
        realLauncher.value = activityResultRegistry.register(key, contract) {
            currentOnResult.value(it)
        }
        onDispose {
            realLauncher.value?.unregister()
        }
    }
    return returnedLauncher
}
fun isPermissionsGranted(context: Context): Boolean {
    val isLocationPermissionGranted = ContextCompat.checkSelfPermission(
        context,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    val isCoarseLocationPermissionGranted = ContextCompat.checkSelfPermission(
        context,
        Manifest.permission.ACCESS_COARSE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    return isLocationPermissionGranted || isCoarseLocationPermissionGranted

}
@Composable
fun StartRequestPermission(
    context: Context,
    fetchCurrentWeather: () -> Unit
) {
    registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { result ->
        if (result.maxOf { it.value }) {
            fetchCurrentWeather()
        } else {
            Toast.makeText(
                context,
                "Чтобы получить данные о погоде необходимо дать разрешение",
                Toast.LENGTH_SHORT
            ).show()
        }
    }.launch(
        arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
        )
    )
}