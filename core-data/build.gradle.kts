plugins {
    id("app-android-library")
    id("app-hilt")
}

android {
    namespace = "com.tkjen.core.data"

    defaultConfig {


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }


}

dependencies {

    implementation(libs.bundles.ui)
    testImplementation(libs.junit)
    implementation(libs.bundles.coroutines)
    implementation(project(":core-network"))
    implementation(project(":core-common"))
    implementation(project(":core-model"))
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}