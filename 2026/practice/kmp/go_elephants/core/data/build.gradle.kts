plugins {
    id("ru.caravanlabs.elephants.convention.coremultiplatform")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:domain"))
            implementation(libs.multiplatformSettings)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        androidMain.dependencies {

        }

        iosMain.dependencies {

        }
    }
}
