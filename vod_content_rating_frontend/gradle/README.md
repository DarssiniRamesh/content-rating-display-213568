This directory contains the Gradle wrapper configuration for the repository root.
The root-level gradlew and gradlew.bat delegate to the nested Android project at:
content-rating-display-213568/vod_content_rating_frontend

If your analyzer invokes ./gradlew from the repository root, it will bootstrap Gradle using this wrapper and operate on the included build defined in settings.gradle(.kts), which points to the nested Android project.
