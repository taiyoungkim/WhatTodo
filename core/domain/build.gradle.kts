plugins {
    id("tydev.android.library")
    id("tydev.android.library.jacoco")
    kotlin("kapt")
}

android {
    namespace = "com.tydev.whattodo.core.domain"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // room
    implementation(libs.room.ktx)
    implementation(libs.room.compiler)
    implementation(libs.room.runtime)
}
