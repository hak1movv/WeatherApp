package com.example.weatherapp.domain.managers

import android.Manifest
import android.app.Application
import android.content.pm.PackageManager
import android.location.Location
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.android.gms.tasks.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlin.coroutines.resume

class DefaultGetCurrentLocationManager(
    private val locationClient: FusedLocationProviderClient,

    private val application: Application

) : GetCurrentLocationManager {
    suspend fun getCurrentLocation(): Location? {
        val isLocationPermissionGranted = ContextCompat.checkSelfPermission(
            application,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
        val isCoarseLocationPermissionGranted = ContextCompat.checkSelfPermission(
            application,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
        if (!isLocationPermissionGranted || !isCoarseLocationPermissionGranted) {
            showToast("Needed Location Permission!")
            return null
        }

        val cancellationTokenSource = CancellationTokenSource()
        val currentLocationTask: Task<Location> = locationClient.getCurrentLocation(
            Priority.PRIORITY_HIGH_ACCURACY,
            cancellationTokenSource.token
        )
        return suspendCancellableCoroutine { cons ->
            currentLocationTask.addOnCompleteListener { task: Task<Location> ->
                    if(task.isSuccessful) {
                        val result = task.result
                        cons.resume(result)
                } else cons.resume(null)
            }
        }


    }

    private suspend fun showToast(
        message: String
    ) {
        withContext(Dispatchers.Main) {
        }
    }

    override suspend fun getCurrentLocationManager(): Location? {
        TODO("Not yet implemented")
    }
}