pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "mutiple-modules"
include(":app")
include(":core-network")
include(":core-localstorage")
include(":core-model")
include(":core-data")
include(":core-theme")
include(":core-designSystem")
include(":core-navigation")
