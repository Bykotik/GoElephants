import org.jetbrains.compose.reload.gradle.ComposeHotRun
import org.jetbrains.kotlin.compose.compiler.gradle.ComposeFeatureFlag

plugins {
    id("ru.caravanlabs.elephants.convention.application")
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.buildkonfig)
}

kotlin {
    sourceSets {
        androidMain.dependencies {

        }
        commonMain.dependencies {
            implementation(project(":core:ui"))
            implementation(project(":core:domain"))
            implementation(project(":core:data"))
        }
        iosMain.dependencies {

        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

// https://github.com/JetBrains/compose-hot-reload
composeCompiler {
    featureFlags.add(ComposeFeatureFlag.OptimizeNonSkippingGroups)
}
tasks.withType<ComposeHotRun>().configureEach {
    mainClass.set("MainKt")
}

// https://github.com/yshrsmz/BuildKonfig
buildkonfig {
    packageName = "ru.caravanlabs.elephants"
    exposeObjectWithName = "BuildKonfig"
    defaultConfigs {

    }
}

dependencies {
    debugImplementation(libs.compose.uiTooling)
}

