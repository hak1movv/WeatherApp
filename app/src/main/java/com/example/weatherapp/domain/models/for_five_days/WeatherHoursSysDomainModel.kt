package com.example.weatherapp.domain.models.for_five_days

import java.io.Serializable

data class WeatherHoursSysDomainModel(
    val pod: String,
): Serializable {
    companion object {
        val unknown = WeatherHoursSysDomainModel (
            pod = String(),
        )
    }
}
