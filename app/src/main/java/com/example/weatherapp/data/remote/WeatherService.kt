package com.example.weatherapp.data.remote

import com.example.weatherapp.data.models.current_weather.WeatherDataModel
import com.example.weatherapp.data.utils.Constants.GET_CURRENT_WEATHER_DATA
import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET(GET_CURRENT_WEATHER_DATA)
    suspend fun getCurrentWeather (
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
    ) : Response<WeatherDataModel>

    @GET(GET_CURRENT_WEATHER_DATA)
    suspend fun getWeatherForFiveDays (
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
    ) : Response<WeatherHoursDomainModel>
}

data class Weather(
    val all: String
)