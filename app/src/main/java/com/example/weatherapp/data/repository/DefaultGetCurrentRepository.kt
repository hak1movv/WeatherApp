//package com.example.weatherapp.data.repository
//
//import com.example.weatherapp.data.mappers.toDomain
//import com.example.weatherapp.data.remote.WeatherService
//import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
//import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainModel
//import com.example.weatherapp.domain.repository.WeatherRepository
//import retrofit2.Response
////
////class DefaultGetCurrentRepository(
////    private val service: WeatherService
////
////) : WeatherRepository {
////
////    override suspend fun getCurrentWeatherData(
////        latitude: Double,
////        longitude: Double,
////    ): Response<WeatherDomainModel> {
////        return service.getCurrentWeather(
////            latitude = latitude,
////            longitude = longitude,
////        ).body()?.toDomain() ?: WeatherDomainModel.unknown
////    }
////
////    override suspend fun getWeatherForFiveDays(
////        latitude: Double,
////        longitude: Double
////    ): WeatherHoursDomainModel {
////        return service.getWeatherForFiveDays(latitude = latitude, longitude = )
////    }
//}
//
