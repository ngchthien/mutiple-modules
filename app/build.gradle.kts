plugins {
    // Chỉ cần áp dụng plugin quy ước bạn đã tạo!
    id("app-android-application")
    id("app-hilt")

    alias(libs.plugins.navigation.safeargs)
}
dependencies {

    implementation(libs.bundles.ui)
    implementation(libs.bundles.coroutines)
    implementation(libs.bundles.lifecycle)
    implementation(libs.bundles.navigation)
    implementation(libs.bundles.retrofit)
    implementation(libs.bundles.room)

    // Hoặc thêm từng thư viện một
    implementation(libs.fragment.ktx)
    implementation(libs.glide)
    ksp(libs.glide.compiler) // Dùng ksp thay vì annotationProcessor


    // Room compiler
    ksp(libs.room.compiler)

    // Thư viện Test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}
