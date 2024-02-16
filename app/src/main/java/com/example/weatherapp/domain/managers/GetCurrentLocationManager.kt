package com.example.weatherapp.domain.managers

import android.location.Location

interface GetCurrentLocationManager {

    suspend fun getCurrentLocationManager(): Location?

}