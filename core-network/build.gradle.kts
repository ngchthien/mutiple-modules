plugins {
    id("app-android-library")
    id("app-hilt")
    alias(libs.plugins.secrets)
}
secrets{
    defaultPropertiesFileName = "${project.projectDir}/release.properties"

}
android {
    namespace = "com.tkjen.core.network"
    defaultConfig {

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    buildFeatures {
        buildConfig = true // Bật tính năng này
    }

}
dependencies {

    implementation(libs.bundles.ui)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)

    implementation(libs.retrofit.converter.moshi)
    implementation(libs.moshi.kotlin)
    implementation(project(mapOf("path" to ":core-common")))
    ksp(libs.moshi.codegen)

    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)

    implementation(libs.bundles.coroutines)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}