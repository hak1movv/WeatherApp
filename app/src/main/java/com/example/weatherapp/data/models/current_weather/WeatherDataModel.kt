package com.example.weatherapp.data.models.current_weather

import com.example.weatherapp.presentation.theme.EMPTY_STRING
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class WeatherDataModel(
    @SerializedName("coord")
    val weatherCoordinate: WeatherCoordinateModel,
    @SerializedName("weather")
    val weather: WeatherCloudModel,
    @SerializedName("base")
    val weatherBase: String,
    @SerializedName("main")
    val weatherMain: WeatherMainModel,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("wind")
    val weatherWindInfo: WeatherWindModel,
    @SerializedName("clouds")
    val weatherClouds: WeatherCloudsModel,
    @SerializedName("name")
    val cityName: String,
    val countryModel: WeatherSysDataModel
) : Serializable {
    companion object {
        val unknown = WeatherDataModel(
            weatherBase = EMPTY_STRING,
            weather = WeatherCloudModel.unknown,
            weatherClouds = WeatherCloudsModel.unknown,
            weatherCoordinate = WeatherCoordinateModel.unknown,
            weatherMain = WeatherMainModel.unknown,
            weatherWindInfo = WeatherWindModel.unknown,
            cityName = EMPTY_STRING,
            visibility = 0,
            countryModel = WeatherSysDataModel(String())
        )

    }
}


