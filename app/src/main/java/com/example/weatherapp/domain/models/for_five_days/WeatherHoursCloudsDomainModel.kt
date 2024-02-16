package com.example.weatherapp.domain.models.for_five_days

import java.io.Serializable

data class WeatherHoursCloudsDomainModel(
    val all: Int,
): Serializable {
    companion object {
        val unknown = WeatherHoursCloudsDomainModel(
            all = 0,
        )
    }
}
