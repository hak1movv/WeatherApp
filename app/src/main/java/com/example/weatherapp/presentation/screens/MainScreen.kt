package com.example.weatherapp.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.R
import com.example.weatherapp.domain.use_cases.GetCurrentWeatherUseCase
import com.example.weatherapp.presentation.theme.BackgroundDefault
import com.example.weatherapp.presentation.theme.BackgroundLight
import com.example.weatherapp.presentation.theme.BoxGradientColorGrayBlue
import com.example.weatherapp.presentation.theme.BoxGradientColorWhiteBlue
import com.example.weatherapp.presentation.theme.dp1
import com.example.weatherapp.presentation.theme.dp10
import com.example.weatherapp.presentation.theme.dp12
import com.example.weatherapp.presentation.theme.dp15
import com.example.weatherapp.presentation.theme.dp16
import com.example.weatherapp.presentation.theme.dp2
import com.example.weatherapp.presentation.theme.dp20
import com.example.weatherapp.presentation.theme.dp24
import com.example.weatherapp.presentation.theme.dp5
import com.example.weatherapp.presentation.theme.dp66
import com.example.weatherapp.presentation.theme.sp16
import com.example.weatherapp.presentation.theme.sp18
import com.example.weatherapp.presentation.theme.sp48

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    viewModel: MainScreenViewModel,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        BackgroundLight,
                        BackgroundDefault
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = modifier
                .padding(horizontal = dp20),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = stringResource(id = R.string.english),
                    fontSize = sp16,
                    color = Color.White
                )
            }
            Spacer(modifier = modifier.weight(1f))
            Text(
                text = stringResource(id = R.string.weather),
                fontSize = sp18,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Text(
            text = "Osh,Kyrgyzstan",
            fontSize = sp18,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = modifier.padding(top = dp20)
        )
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.padding(top = dp10),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.time),
                fontSize = sp16,
                color = Color.White
            )
            Divider(
                modifier = modifier
                    .width(dp15)
                    .height(dp1)
                    .padding(horizontal = dp2),
                color = Color.White,
            )
            Text(
                text = stringResource(R.string.dayOfWeek),
                fontSize = sp16,
                color = Color.White
            )
        }
        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = null,
            modifier = modifier.padding(top = dp15)
        )
        Text(
            text = stringResource(R.string.temperature),
            fontSize = sp48,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )
        Text(
            text = stringResource(R.string.sunny_day),
            fontSize = sp16,
            fontWeight = FontWeight.Light,
            color = Color.White
        )
        Box(
            modifier = modifier
                .padding(horizontal = dp16)
                .padding(top = dp16)
                .fillMaxWidth()
                .height(dp66)
                .clip(RoundedCornerShape(dp12))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            BoxGradientColorWhiteBlue,
                            BoxGradientColorGrayBlue,
                        )
                    )
                ),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = modifier.fillMaxSize()
            ) {
                Spacer(modifier = modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.rain_signiture),
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "1%",
                    fontSize = sp16,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = modifier.padding(start = dp5)
                )
                Spacer(modifier = modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.termometer),
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "90%",
                    fontSize = sp16,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = modifier.padding(start = dp5)
                )
                Spacer(modifier = modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.wind),
                    contentDescription = null,
                    tint = Color.White
                )
                Text(
                    text = "17 km/h",
                    fontSize = sp16,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = modifier.padding(start = dp5)
                )
                Spacer(modifier = modifier.weight(1f))
            }
        }
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = modifier
                .padding(end = dp16)
                .fillMaxWidth()
        ) {
            TextButton(
                onClick = {  },
                modifier = modifier.padding(end = dp5)
            ) {
                Text(
                    text = stringResource(R.string.this_week),
                    fontSize = sp16,
                    color = Color.White
                )
            }
            TextButton(
                onClick = { /*TODO*/ },
                modifier = modifier.padding(end = dp20)
            ) {
                Text(
                    text = stringResource(R.string.today),
                    fontSize = sp16,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
        Divider(
            modifier = modifier
                .fillMaxWidth()
                .padding(end = dp16)
                .height(dp2),
            color = Color.LightGray
        )
        LazyRow(
            content = {
            }
        )
        Text(
            text = stringResource(R.string.latest_news),
            fontWeight = FontWeight.Bold,
            fontSize = sp18,
            color = Color.White,
            modifier = modifier
                .align(Alignment.End)
                .padding(end = dp16, top = dp24)
        )
    }
}


@Preview
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        com.example.weatherapp.presentation.MainScreen()
    }
}