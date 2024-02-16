package com.example.weatherapp.domain.use_cases

import com.example.weatherapp.data.base.models.ResultStatus
import com.example.weatherapp.data.remote.Weather
import com.example.weatherapp.domain.managers.GetCurrentLocationManager
import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
import com.example.weatherapp.domain.repository.WeatherRepository
import retrofit2.Response
import javax.inject.Inject

class DefaultGetCurrentWeatherUseCase(
    private val repository: WeatherRepository,
    private val getCurrentLocationManager: GetCurrentLocationManager
) : GetCurrentWeatherUseCase {
    override suspend fun invoke(
        latitude: Double,
        longitude: Double
    ): Response<WeatherDomainModel> {
        val currentLocation = getCurrentLocationManager.getCurrentLocationManager()
        return if (currentLocation != null) repository.getCurrentWeatherData(
            latitude = currentLocation.latitude,
            longitude = currentLocation.longitude,
        ) else return repository.getCurrentWeatherData(0.0, 0.0)

    }

}
