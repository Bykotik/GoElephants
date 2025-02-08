package com.example.moblile_bootcamp_practise_010225.ui.theme.models

data class DayWeather(
    val date: String,
    val conditionText: String,
    val conditionIcon: Int,
    val maxDayTemp: Double,
    val minDayTemp: Double,
    val sunrise: String,
    val sunset: String,
    val moonrise: String,
    val moonset: String,
    val willItRain: Int,
    val rainChance: Int,
    val willItSnow: Int,
    val snowChance: Int
)