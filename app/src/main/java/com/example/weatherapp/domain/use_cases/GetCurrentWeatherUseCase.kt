package com.example.weatherapp.domain.use_cases

import com.example.weatherapp.data.base.models.ResultStatus
import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
import retrofit2.Response

interface GetCurrentWeatherUseCase {
    suspend fun invoke(
        latitude: Double,
        longitude: Double,
    ): Response<WeatherDomainModel>
}