plugins {
    id("app-android-library")
    id("app-hilt")
}
android {
    namespace = "com.tkjen.core.network"
    defaultConfig {

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

}
dependencies {

    implementation(libs.bundles.ui)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}