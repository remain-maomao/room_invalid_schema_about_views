// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    /*kapt插件*/
    alias(libs.plugins.kapt) apply false
    /*room插件*/
    alias(libs.plugins.room) apply false

    alias(libs.plugins.compose.compiler) apply false
}