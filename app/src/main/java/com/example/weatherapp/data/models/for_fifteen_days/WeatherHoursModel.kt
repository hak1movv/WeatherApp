package com.example.weatherapp.data.models.for_fifteen_days

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeatherHoursModel(
    @SerializedName("list")
    val list: List<WeatherHourslListMode>
) : Serializable {
    companion object {
        val unknown =  WeatherHoursModel (
            list = emptyList()
        )
    }
}