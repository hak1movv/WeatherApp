package com.example.weatherapp.data.models.current_weather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeatherWindModel(
    @SerializedName("speed") val windSpeed: Int,
    @SerializedName("deg") val windDeg: Int,
) : Serializable {
    companion object {
        val unknown = WeatherWindModel(
            windSpeed = 0,
            windDeg = 0,
        )
    }
}
