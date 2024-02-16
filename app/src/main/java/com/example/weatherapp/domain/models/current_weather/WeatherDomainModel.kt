package com.example.weatherapp.domain.models.current_weather

import com.example.weatherapp.data.models.current_weather.WeatherCloudModel
import com.example.weatherapp.data.models.current_weather.WeatherCoordinateModel
import com.example.weatherapp.data.models.current_weather.WeatherMainModel
import com.example.weatherapp.data.models.current_weather.WeatherWindModel
import com.example.weatherapp.data.utils.Constants
import java.io.Serializable

data class WeatherDomainModel(
    val weatherCoordinate: WeatherCoordinateDomainModel,
    val weatherBase: String,
    val weatherMain: WeatherMainDomainModel,
    val weatherVisibility: Int,
    val weatherWind: WeatherWindDomainModel,
    val weatherCloud: WeatherCloudDomainModel,
    val cityName: String,
) : Serializable {
    companion object {
        val unknown = WeatherDomainModel(
            weatherBase = Constants.EMPTY_STRING,
            cityName = Constants.EMPTY_STRING,
            weatherCoordinate = WeatherCoordinateDomainModel.unknown,
            weatherMain = WeatherMainDomainModel.unknown,
            weatherCloud = WeatherCloudDomainModel.unknown,
            weatherVisibility = 0,
            weatherWind = WeatherWindDomainModel.unknown,
        )
    }
}
