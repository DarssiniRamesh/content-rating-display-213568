# CI Bootstrap

This repository hosts the Android project under:
- content-rating-display-213568/vod_content_rating_frontend

Use one of these commands:
- ./gradlew :content-rating-display-213568:vod_content_rating_frontend:app:assembleDebug
- (recommended) cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Notes:
- Gradle Declarative (.dcl) files are used with traditional Gradle bridge files for compatibility.
- The Android app implements the Post-Playback Rating feature with stubbed APIs to run offline.
