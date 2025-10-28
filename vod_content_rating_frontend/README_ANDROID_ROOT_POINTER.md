# Android Project Root Pointer

Canonical Android workspace:
- content-rating-display-213568/vod_content_rating_frontend

How to build:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Bridges:
- Root settings.gradle/settings.gradle.kts includeBuild to delegate to the workspace.
- Root gradlew/gradlew.bat delegate to the workspace wrapper.
