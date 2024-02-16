package com.example.weatherapp.domain.models.current_weather

import java.io.Serializable

data class WeatherMainDomainModel(
    val weatherTemperature: Double,
    val weatherFeels: Double,
    val weatherMinTemperature: Double,
    val weatherMaxTemperature: Double,
    val weatherPressure: Int,
    val weatherHumidity: Int,
) : Serializable {
    companion object {
        val unknown = WeatherMainDomainModel(
            weatherHumidity = 0,
            weatherMinTemperature = 0.0,
            weatherMaxTemperature = 0.0,
            weatherFeels = 0.0,
            weatherPressure = 0,
            weatherTemperature = 0.0,
        )
    }
}
