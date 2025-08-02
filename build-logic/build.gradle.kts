plugins{
    `kotlin-dsl`
}
dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)

}
gradlePlugin{
    plugins {
        register("ApplicationConventionPlugin") {
            id = "app-android-application"
            implementationClass = "ApplicationConventionPlugin"
        }
        register("ApplicationLibraryConventionPlugin") {
            id = "app-android-library"
            implementationClass = "ApplicationLibraryConventionPlugin"
        }
        register("HiltConventionPlugin") {
            id = "app-hilt" // Đặt ID cho nó, ví dụ "app-hilt"
            implementationClass = "HiltConventionPlugin"
        }
    }
}