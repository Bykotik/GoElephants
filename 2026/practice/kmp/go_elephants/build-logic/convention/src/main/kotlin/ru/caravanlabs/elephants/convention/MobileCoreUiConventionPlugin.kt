package ru.caravanlabs.elephants.convention

import ru.caravanlabs.elephants.convention.utils.getLibraryFromLibsToml
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.findByType
import org.jetbrains.compose.ComposePlugin
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MobileCoreUiConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {

            with(pluginManager) {
                apply("ru.caravanlabs.elephants.convention.coremultiplatform")
                apply("org.jetbrains.compose")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            extensions.configure<KotlinMultiplatformExtension> {

                with(extensions.findByType<ComposePlugin.Dependencies>()!!) {
                    with(sourceSets) {
                        androidMain.dependencies {
                            implementation(preview)
                            implementation(getLibraryFromLibsToml("androidx.activity-compose"))
                        }
                        commonMain.dependencies {
                            implementation(runtime)
                            implementation(foundation)
                            implementation(material3)
                            implementation(ui)
                            implementation(components.resources)
                            implementation(components.uiToolingPreview)
                            implementation(materialIconsExtended)
                            implementation(getLibraryFromLibsToml("multiplatformSettings"))
                            implementation(getLibraryFromLibsToml("androidx.lifecycle.viewmodelCompose"))
                            implementation(getLibraryFromLibsToml("androidx.lifecycle.runtimeCompose"))
                        }

                    }
                }
            }
        }
    }
}