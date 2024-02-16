package com.example.weatherapp.domain.repository

//import com.example.weatherapp.data.base.BaseDataSource
//import com.example.weatherapp.data.base.models.ResultStatus
//import com.example.weatherapp.data.mappers.toDomain
//import com.example.weatherapp.data.remote.Weather
//import com.example.weatherapp.data.remote.WeatherService
//import com.example.weatherapp.domain.models.current_weather.WeatherDomainModel
//import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainListModel
//import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainModel
//import retrofit2.Response
//import javax.inject.Inject
//
//class WeatherRepositoryImpl @Inject constructor(
//    private val service: WeatherService
//) : WeatherRepository, BaseDataSource() {
//
//    override suspend fun getCurrentWeatherData(
//        latitude: Double,
//        longitude: Double
//    ): ResultStatus<WeatherDomainModel> {
//        val response = invokeResponseRequest {
//            service.getCurrentWeather(
//                latitude = latitude,
//                longitude = longitude,
//            )
//        }
//        return ResultStatus(
//            status = response.status,
//            errorThrowable = response.errorThrowable,
//            data = response.data?.toDomain(),
//        )
//
//    }
//
//    override suspend fun getWeatherForFiveDays(
//        latitude: Double,
//        longitude: Double
//    ): List<WeatherHoursDomainListModel> {
//        TODO("Not yet implemented")
//    }
//}
//
//
//suspend fun getWeatherForFiveDays(
//    latitude: Double,
//    longitude: Double
//): WeatherHoursDomainModel {
//
//}



