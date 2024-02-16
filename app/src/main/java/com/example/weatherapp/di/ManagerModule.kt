package com.example.weatherapp.di

import android.app.Application
import com.example.weatherapp.domain.managers.DefaultGetCurrentLocationManager
import com.example.weatherapp.domain.managers.GetCurrentLocationManager

import com.google.android.gms.location.LocationServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ManagerModule {
    @Provides
    fun providesLocationTrackerManager(
        application: Application
    ): DefaultGetCurrentLocationManager = DefaultGetCurrentLocationManager(
        application = application,
        locationClient = LocationServices.getFusedLocationProviderClient(application)
    )
}