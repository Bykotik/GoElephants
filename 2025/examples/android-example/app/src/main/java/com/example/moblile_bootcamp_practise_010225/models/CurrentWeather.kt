package com.example.moblile_bootcamp_practise_010225.ui.theme.models

data class CurrentWeather(
    val city: String,
    val currentDay: String,
    val currentTemp: Double,
    val feelsLikeTemp: Double,
    val conditionText: String,
    val conditionIcon: Int,
    val lastUpdateInfo: String,
    val humidity: Int,
    val pressure: Double,
    val windSpeed: Double,
    val windDirection: String,
    val precipitation: Double,
    val visibility: Double,
    val uvIndex: Double
)
