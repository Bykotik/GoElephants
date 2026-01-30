plugins {
    id("ru.caravanlabs.elephants.convention.core.ui")
}

kotlin {
    sourceSets {
        commonMain.dependencies {

        }

        androidMain.dependencies {

        }

        iosMain.dependencies {

        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "ru.caravanlabs.elephants.resources"
    generateResClass = auto
}