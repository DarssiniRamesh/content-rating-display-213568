# Android CI Build Guide

Android project root:
- content-rating-display-213568/vod_content_rating_frontend

Build from repository root (bootstrap wrapper delegates to project wrapper):
- ./gradlew :app:assembleDebug

Alternate (from project root):
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Launcher Activity:
- org.example.app.ui.IndiceActivity

Notes:
- Project uses Gradle 9 Declarative (settings.gradle.dcl, build.gradle.dcl).
- Compatibility files (settings.gradle, settings.gradle.kts, build.gradle) exist for discovery only.
