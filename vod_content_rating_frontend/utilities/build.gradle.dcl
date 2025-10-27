androidLibrary {
    namespace = "org.gradle.experimental.android.utilities"

    dependencies {
        api(project(":list"))
        implementation("androidx.annotation:annotation:1.8.0")
    }
}
