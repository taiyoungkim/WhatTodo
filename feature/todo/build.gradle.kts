plugins {
    id("tydev.android.feature")
    id("tydev.android.library.compose")
    id("tydev.android.library.jacoco")
}

android {
    namespace = "com.tydev.whattodo.feature.todo"
}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:data"))
}
