plugins {
    id("tydev.android.feature")
    id("tydev.android.library.compose")
    id("tydev.android.library.jacoco")
}

android {
    namespace = "com.tydev.whattodo.feature.todo"
}

dependencies {
    implementation(libs.androidx.compose.material3.windowSizeClass)
}
