package com.example.weatherapp.domain.use_cases

//import com.example.weatherapp.domain.models.for_five_days.WeatherHoursDomainListModel
//import com.example.weatherapp.domain.repository.WeatherRepository
//import javax.inject.Inject
//
//class DefaultGetWeatherForFiveDaysUseCase @Inject constructor(
//    private val repository: WeatherRepository
//) : GetWeatherForFiveDaysUseCase {
//    override suspend fun invoke(
//        latitude: Double,
//        longitude: Double
//    ): List<WeatherHoursDomainListModel> = repository.getWeatherForFiveDays(
//        latitude = longitude,
//        longitude = longitude,
//    ).map { it. } ?: emptyList()
//}
