package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainListModel
import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainModel
import retrofit2.Response

interface WeatherRepository {

    suspend fun getCurrentWeatherData(
        latitude: Double,
        longitude: Double,
    ): Response<WeatherDomainModel>

    suspend fun getWeatherForFiveDays(
        latitude: Double,
        longitude: Double,
    ): List<WeatherHoursDomainListModel>
}