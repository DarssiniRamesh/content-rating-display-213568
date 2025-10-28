# Building the Android project

Android workspace root:
- content-rating-display-213568/vod_content_rating_frontend

Gradle wrapper:
- content-rating-display-213568/vod_content_rating_frontend/gradlew

Build commands:
- From repository root (bridge): ./gradlew :app:assembleDebug
- Or from Android project root:
  cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Notes:
- This repository includes root-level Gradle bridge files purely for discovery; the actual Android build is defined under the workspace.
