package com.example.weatherapp.di

//import com.example.weatherapp.domain.repository.WeatherRepository
//import com.example.weatherapp.domain.use_cases.DefaultGetCurrentWeatherUseCase
//import com.example.weatherapp.domain.use_cases.GetCurrentWeatherUseCase
//import com.example.weatherapp.domain.use_cases.GetWeatherForFiveDaysUseCase
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//
//@Module
//@InstallIn(SingletonComponent::class)
//class DomainModel {
//    @Provides
//    fun provideGetCurrentWeatherUseCase(
//        repository: WeatherRepository
//    ): GetCurrentWeatherUseCase = DefaultGetCurrentWeatherUseCase(
//        repository = repository,
//
//
//    )
//
//    @Provides
//    fun providesGetWeatherForFiveDaysUseCase(
//        repository: WeatherRepository
//    ): GetWeatherForFiveDaysUseCase = DefaultGetWeatherForFiveDaysUseCase(
//        repository = repository
//    )
//
//
//}