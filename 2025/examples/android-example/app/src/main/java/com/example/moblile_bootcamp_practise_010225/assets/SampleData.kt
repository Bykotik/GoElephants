package com.example.moblile_bootcamp_practise_010225.ui.theme.assets

import androidx.compose.ui.res.stringResource
import com.example.moblile_bootcamp_practise_010225.R
import com.example.moblile_bootcamp_practise_010225.ui.theme.models.CurrentWeather
import com.example.moblile_bootcamp_practise_010225.ui.theme.models.DayWeather
import com.example.moblile_bootcamp_practise_010225.ui.theme.models.HourWeather

object SampleData {
    val currentWeatherSample = CurrentWeather(
        city = "Nha Trang",
        currentDay = "Fri, 31 February",
        currentTemp = 25.6,
        feelsLikeTemp = 27.1,
        conditionText = "Sunny",
        conditionIcon = R.drawable.clear_day,
        lastUpdateInfo = "31/01 15:15",
        humidity = 67,
        pressure = 1008.0,
        windSpeed = 16.2,
        windDirection = "ENE",
        precipitation = 0.0,
        visibility = 10.0,
        uvIndex = 3.1
    )

    val dayWeatherSample = listOf(
        DayWeather(
            date = "Fri",
            conditionText = "Sunny",
            conditionIcon = R.drawable.clear_day, //"//cdn.weatherapi.com/weather/64x64/day/113.png"
            maxDayTemp = 26.6,
            minDayTemp = 17.8,
            sunrise = "06:09 AM",
            sunset = "05:45 PM",
            moonrise = "07:29 AM",
            moonset = "07:32 PM",
            willItRain = 0,
            rainChance = 0,
            willItSnow = 0,
            snowChance = 0
        ),
        DayWeather(
            date = "Sat",
            conditionText = "Patchy rain nearby",
            conditionIcon = R.drawable.cloudy_1_day, //"//cdn.weatherapi.com/weather/64x64/day/176.png"
            maxDayTemp = 26.7,
            minDayTemp = 21.1,
            sunrise = "06:08 AM",
            sunset = "05:46 PM",
            moonrise = "08:55 AM",
            moonset = "09:22 PM",
            willItRain = 1,
            rainChance = 85,
            willItSnow = 0,
            snowChance = 0
        ),
        DayWeather(
            date = "Sun",
            conditionText = "Partly Cloudy",
            conditionIcon = R.drawable.cloudy_1_day, //"//cdn.weatherapi.com/weather/64x64/day/116.png"
            maxDayTemp = 28.3,
            minDayTemp = 23.2,
            sunrise = "06:07 AM",
            sunset = "05:48 PM",
            moonrise = "08:55 AM",
            moonset = "09:22 PM",
            willItRain = 0,
            rainChance = 23,
            willItSnow = 0,
            snowChance = 0
        ),
        DayWeather(
            date = "Mon",
            conditionText = "Light rain shower",
            conditionIcon = R.drawable.cloudy_1_day, //"//cdn.weatherapi.com/weather/64x64/day/353.png"
            maxDayTemp = 30.3,
            minDayTemp = 22.2,
            sunrise = "06:07 AM",
            sunset = "05:48 PM",
            moonrise = "08:55 AM",
            moonset = "09:22 PM",
            willItRain = 1,
            rainChance = 98,
            willItSnow = 0,
            snowChance = 0
        ),
        DayWeather(
            date = "Tue",
            conditionText = "Mist",
            conditionIcon = R.drawable.cloudy_1_day, //"//cdn.weatherapi.com/weather/64x64/day/143.png"
            maxDayTemp = 26.3,
            minDayTemp = 21.2,
            sunrise = "06:07 AM",
            sunset = "05:48 PM",
            moonrise = "08:55 AM",
            moonset = "09:22 PM",
            willItRain = 1,
            rainChance = 55,
            willItSnow = 0,
            snowChance = 0
        )
    )

    val hourWeatherSample = listOf(
        HourWeather(
            hour = "00:00",
            conditionIcon = R.drawable.clear_night, //"//cdn.weatherapi.com/weather/64x64/night/113.png"
            humidity = 91,
            temperature = 18.6
        ),
        HourWeather(
            hour = "01:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 18.6
        ),
        HourWeather(
            hour = "02:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 18.6
        ),
        HourWeather(
            hour = "03:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 18.2
        ),
        HourWeather(
            hour = "04:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 18.2
        ),
        HourWeather(
            hour = "05:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 18.2
        ),
        HourWeather(
            hour = "06:00",
            conditionIcon = R.drawable.clear_night,
            humidity = 91,
            temperature = 17.6
        ),
        HourWeather(
            hour = "07:00",
            conditionIcon = R.drawable.clear_day,
            humidity = 90,
            temperature = 17.6
        ),
        HourWeather(
            hour = "08:00",
            conditionIcon = R.drawable.clear_day,
            humidity = 78,
            temperature = 20.6
        ),
        HourWeather(
            hour = "09:00",
            conditionIcon = R.drawable.clear_day,
            humidity = 70,
            temperature = 22.8
        ),
        HourWeather(
            hour = "10:00",
            conditionIcon = R.drawable.cloudy_1_day,
            humidity = 62,
            temperature = 24.8
        ),
        HourWeather(
            hour = "11:00",
            conditionIcon = R.drawable.cloudy_1_day,
            humidity = 60,
            temperature = 26.2
        )
    )
}