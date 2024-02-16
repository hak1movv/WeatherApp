package com.example.weatherapp.data.models.current_weather

data class WeatherCloudsModel(
    val all: Int,
) {
    companion object {
        val unknown = WeatherCloudsModel(
            all = 0,
        )
    }
}
