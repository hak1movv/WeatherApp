package com.example.weatherapp.domain.models.for_five_days

import java.io.Serializable

data class WeatherHoursCloudDomainModel(
    val id: Int,
    val main: String,
    val description: String,
) : Serializable {
    companion object {
        val unknown = WeatherHoursCloudDomainModel(
            main = String(),
            id = 0,
            description = String(),
        )
    }
}
