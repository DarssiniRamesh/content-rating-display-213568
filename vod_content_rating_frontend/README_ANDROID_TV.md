# Android TV App - Build and Project Root

Project root for Android Gradle build:
- content-rating-display-213568/vod_content_rating_frontend

How to build from repository root:
- ./build-android-tv.sh
or
- ./gradlew-android-tv :app:assembleDebug

Notes:
- The project uses Gradle 9 Declarative settings (settings.gradle.dcl). A proxy settings.gradle is present for tooling compatibility.
- Modules: :app, :list, :utilities
