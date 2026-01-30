package ru.caravanlabs.elephants.convention

import ru.caravanlabs.elephants.convention.utils.getLibraryFromLibsToml
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.compose.ComposePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MobileFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {

            with(pluginManager) {
                apply("ru.caravanlabs.elephants.convention.coremultiplatform")
                apply("ru.caravanlabs.elephants.convention.core.ui")
            }

            extensions.configure<KotlinMultiplatformExtension> {
                with(extensions.findByType<ComposePlugin.Dependencies>()!!) {
                    with(sourceSets) {
                        commonMain.dependencies {
                            implementation(project(":core:data"))
                            implementation(project(":core:domain"))
                            implementation(project(":core:ui"))
                            implementation(getLibraryFromLibsToml("androidx.lifecycle.viewmodelCompose"))
                            implementation(getLibraryFromLibsToml("androidx.lifecycle.runtimeCompose"))
                            implementation(foundation)
                            implementation(getLibraryFromLibsToml("coroutines-core"))
                        }
                        androidMain.dependencies {
                            implementation(getLibraryFromLibsToml("coroutines-android"))
                        }
                    }
                }
            }
        }
    }
}
