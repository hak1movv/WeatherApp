package com.example.weatherapp.domain.models.current_weather

import java.io.Serializable

data class WeatherWindDomainModel(
    val windSpeed: Int,
    val windDeg: Int
) : Serializable {

    companion object {
        val unknown = WeatherWindDomainModel(
            windSpeed = 0,
            windDeg = 0,
        )
    }
}
