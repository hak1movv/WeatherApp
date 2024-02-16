package com.example.weatherapp.domain.models.current_weather

import com.example.weatherapp.data.models.current_weather.WeatherCloudsModel
import java.io.Serializable

data class WeatherCloudDomainModel(
    val all: Int,
) {
    companion object {
        val unknown = WeatherCloudDomainModel(
            all = 0,
        )
    }
}