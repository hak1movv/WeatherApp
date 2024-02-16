package com.example.weatherapp.domain.models.current_weather

import java.io.Serializable

data class CurrentWeatherDomainModel(
    val weatherId: Int,
    val weatherMain: String,
    val weatherDescription: String,
) : Serializable {
    companion object {
        val unknown = CurrentWeatherDomainModel(
            weatherMain = String(),
            weatherId = 0,
            weatherDescription = String(),
        )
    }
}
