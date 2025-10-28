# Gradle Discovery Bridge

This repository contains an Android project under:
- content-rating-display-213568/vod_content_rating_frontend

Root-level Gradle settings include the Android workspace via includeBuild:
- settings.gradle
- settings.gradle.kts
- settings.includeBuild.gradle
- settings.includeBuild.gradle.kts
- settings.gradle.dcl

Build from repository root:
- ./gradlew :app:assembleDebug

Or from the Android workspace:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug
