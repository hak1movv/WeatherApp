package com.example.weatherapp.domain.models.for_five_days

import com.google.gson.annotations.SerializedName

data class WeatherHoursDomainModel(
    @SerializedName("results")
    val results: List<WeatherHoursDomainListModel>
) {
    companion object {
        val unknown = WeatherHoursDomainModel(
            results = emptyList()
        )
    }
}