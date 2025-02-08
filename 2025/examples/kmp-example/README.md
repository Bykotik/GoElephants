# Mobile Bootcamp 2025

Bootcamp repository for mobile and cross-platform development **Student IT-Laboratory** in the direction of Kotlin Multiplatform.

## Task

Make weather app with usage of weatherAPI

* 1-st day: UI layer and navigation between screens
* 2-nd day: Data layer, Clean Architecture, Getting data from the internet

Extended info about task here:
https://www.figma.com/design/B3eP1hzNqwViewkY3yEypQ/KMP-practice-01.02.25

## How to run

- Clone this project
- Run Android Studio (at least Jellyfish)
- Tap button "Run 'app'"

### Base readme

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
