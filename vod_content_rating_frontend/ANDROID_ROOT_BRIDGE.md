# Android Root Bridge

Primary Android project root:
- content-rating-display-213568/vod_content_rating_frontend

Build options:
1) cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
2) From repository root using bridge:
   - settings.gradle (Groovy) aliases modules
   - settings.gradle.kts includes the Android build
   - ./gradlew :appRoot:assembleDebug (bridge)
