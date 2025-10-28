# Root Build Bridge

Some scanners/tools require a conventional Gradle build file at the repository root.

Use this bridge file:
- build-android-bridge.gradle

This does not configure the actual Android app. The functional Android workspace is at:
- content-rating-display-213568/vod_content_rating_frontend

Build the Android app:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug
