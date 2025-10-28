androidApplication {
    namespace = "org.example.app"

    // Note: Packaging/minify config is managed by defaults; proguard rules file is provided in app/proguard-rules.pro for analyzers.
    // This comment serves as a pointer; Gradle Declarative packaging config remains unchanged.

    dependencies {
        implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
        implementation("org.junit.jupiter:junit-jupiter:5.10.2")
        implementation("androidx.appcompat:appcompat:1.7.0")

        // Added explicit AndroidX/Material dependencies for UI used by preview flow
        implementation("com.google.android.material:material:1.12.0")
        implementation("androidx.core:core-ktx:1.13.1")
        implementation("androidx.activity:activity-ktx:1.9.3")
        implementation("androidx.fragment:fragment-ktx:1.8.5")
        implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    }
}
