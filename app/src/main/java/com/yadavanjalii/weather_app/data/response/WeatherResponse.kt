package com.yadavanjalii.weather_app.data.response

import androidx.annotation.Keep
import com.yadavanjalii.weather_app.data.model.*
import java.io.Serializable

@Keep
data class WeatherResponse(


    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
): Serializable