androidApplication {
    namespace = "org.example.app"

    // Note: Packaging/minify config is managed by defaults; proguard rules file is provided in app/proguard-rules.pro for analyzers.
    // This comment serves as a pointer; Gradle Declarative packaging config remains unchanged.

    dependencies {
        implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
        implementation("org.junit.jupiter:junit-jupiter:5.10.2")
        implementation("androidx.appcompat:appcompat:1.7.0")
    }
}
