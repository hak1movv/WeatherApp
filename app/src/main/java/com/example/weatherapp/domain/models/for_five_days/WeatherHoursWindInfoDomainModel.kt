package com.example.weatherapp.domain.models.for_five_days

import com.example.weatherapp.domain.models.current_weather.WeatherWindDomainModel
import java.io.Serializable

data class WeatherHoursWindInfoDomainModel(
    val speed: Double,
    val deg: Int,
    val gust: Double,
) : Serializable {
    companion object {
        val unknown = WeatherHoursWindInfoDomainModel(
            speed = 0.0,
            deg = 0,
            gust = 0.0,

            )
    }
}