package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.models.current_weather.WeatherCloudModel
import com.example.weatherapp.data.models.current_weather.WeatherCloudsModel
import com.example.weatherapp.data.models.current_weather.WeatherCoordinateModel
import com.example.weatherapp.data.models.current_weather.WeatherDataModel
import com.example.weatherapp.data.models.current_weather.WeatherMainModel
import com.example.weatherapp.data.models.current_weather.WeatherWindModel
import com.example.weatherapp.domain.models.current_weather.CurrentWeatherDomainModel
import com.example.weatherapp.domain.models.current_weather.WeatherCloudDomainModel
import com.example.weatherapp.domain.models.current_weather.WeatherCoordinateDomainModel
import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
import com.example.weatherapp.domain.models.current_weather.WeatherMainDomainModel
import com.example.weatherapp.domain.models.current_weather.WeatherWindDomainModel


fun WeatherDataModel.toDomain() = WeatherDomainModel(
    weatherCloud = weatherClouds.toDomain(),
    weatherMain = weatherMain.toDomainModel(),
    weatherCoordinate = weatherCoordinate.toDomainModel(),
    weatherBase = weatherBase,
    weatherVisibility = visibility,
    cityName = cityName,
    weatherWind = weatherWindInfo.toDomainModel()

)


fun WeatherCloudModel.toDomainModel() = CurrentWeatherDomainModel(
    weatherId = weatherId,
    weatherMain = weatherMain,
    weatherDescription = weatherDescription,
)

fun WeatherCloudsModel.toDomain() = WeatherCloudDomainModel(
    all = all,
)

fun WeatherMainModel.toDomainModel() = WeatherMainDomainModel(
    weatherTemperature = weatherTemperature,
    weatherPressure = weatherPressure,
    weatherHumidity = weatherHumidity,
    weatherFeels = feelsLike,
    weatherMaxTemperature = weatherMaxTemp,
    weatherMinTemperature = weatherMinTemp,
)

fun WeatherCoordinateModel.toDomainModel() = WeatherCoordinateDomainModel(
    longitude = longitude,
    latitude = latitude,
)

fun WeatherWindModel.toDomainModel() = WeatherWindDomainModel(
    windSpeed = windSpeed,
    windDeg = windDeg,
)

