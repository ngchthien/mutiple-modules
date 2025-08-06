
plugins {
    id("app-android-library")
    id("app-hilt")
}

android {
    namespace = "com.tkjen.core.common"


    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }


}

dependencies {

    implementation(libs.bundles.ui)
    testImplementation(libs.junit)
    implementation(libs.bundles.coroutines)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}