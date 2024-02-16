package com.example.weatherapp.domain.use_cases

import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainListModel

interface GetWeatherForFiveDaysUseCase {

    suspend fun invoke(
        latitude: Double,
        longitude: Double,
    ): List<WeatherHoursDomainListModel>
}