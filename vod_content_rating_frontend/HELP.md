# Build Entry

This repository hosts the Android workspace at:
- content-rating-display-213568/vod_content_rating_frontend

Build from repo root:
- ./gradlew :app:assembleDebug (bridged)
- or: cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

If your CI invokes `./gradlew assembleDebug`, a bridge is provided in build-forward.gradle.kts.
