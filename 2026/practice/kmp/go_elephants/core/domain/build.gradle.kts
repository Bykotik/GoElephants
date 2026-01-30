plugins {
    id("ru.caravanlabs.elephants.convention.coremultiplatform")
    id(libs.plugins.kotlinx.serialization.get().pluginId)
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