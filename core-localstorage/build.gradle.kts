plugins {
    id("app-android-library")
}

android {
    namespace = "com.tkjen.core.localstorage"


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