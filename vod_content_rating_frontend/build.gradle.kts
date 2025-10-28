plugins {
    // No plugins; this is a bridge to help analyzers resolve the Android module path.
}

gradle.startParameter.projectProperties

// Map the :app module to the actual Android workspace location for strict analyzers.
// The real Android build configuration lives in the workspace (Declarative Gradle).
project(":app") {
    projectDir = file("content-rating-display-213568/vod_content_rating_frontend/app")
}
