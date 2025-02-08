# Mobile bootcamp android native practise
## Note
This project is start sample for practise task on Android native direction on Student labs mobile bootcamp (01-02.02.2025)
## Task
Make weather app with usage of weatherAPI </br>

1-st day: UI layer and navigation between screens </br>
2-nd day: Data layer, Clean Architecture, Getting data from the internet </br>

Extended info about task here: https://www.figma.com/design/ca4HHxDZeOJLniPR5zZXQu/Android-practise-01.02.25?node-id=0-1&t=nLGh9NlEOWnlIFkt-1

## Used features
- Jetpack Compose
- Retrofit
- OkHTTP

## How to run
* You need Android Studio (at least Ladybug) with Kotlin plugin (at least 1.9.0)
* Register on the website https://api.weatherapi.com/v1/
* Get API_KEY
* Create file `secrets.properties` in main directory (near `local.properties`)
* Add `API_KEY=<YourKey>` in `secrets.properties` file, for example `API_KEY="0945degbe7c90hhfc2k7ec88d85c34dd"`
* Change in `MainActivity.kt` file BuildConfig.MAPS_API_KEY to API_KEY or just delete this string
* Build your project
* Run -> Run 'app'



