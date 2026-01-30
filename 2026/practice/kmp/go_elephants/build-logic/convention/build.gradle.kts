plugins {
    `kotlin-dsl`
}

group = "ru.caravanlabs.elephants.template.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.androidGradlePlugin)
    compileOnly(libs.kotlinGradlePlugin)
    compileOnly(libs.kotlinMultiplatformPlugin)
    compileOnly(libs.composeMultiplatformPlugin)
}

gradlePlugin {
    plugins {
        create("mobileApplication") {
            id = "ru.caravanlabs.elephants.convention.application"
            implementationClass = "ru.caravanlabs.elephants.convention.MobileAppPlugin"
        }
        create("mobileFeatureConventions") {
            id = "ru.caravanlabs.elephants.convention.mobilefeature"
            implementationClass = "ru.caravanlabs.elephants.convention.MobileFeatureConventionPlugin"
        }
        create("mobileCoreMultiplatformConventions") {
            id = "ru.caravanlabs.elephants.convention.coremultiplatform"
            implementationClass = "ru.caravanlabs.elephants.convention.MobileCoreMultiplatformConventionPlugin"
        }
        create("mobileCoreUiConventions") {
            id = "ru.caravanlabs.elephants.convention.core.ui"
            implementationClass = "ru.caravanlabs.elephants.convention.MobileCoreUiConventionPlugin"
        }
    }
}
