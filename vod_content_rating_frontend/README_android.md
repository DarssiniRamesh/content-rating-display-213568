# Android Project

Workspace root:
- content-rating-display-213568/vod_content_rating_frontend

Gradle wrapper:
- content-rating-display-213568/vod_content_rating_frontend/gradlew

Primary settings (Declarative Gradle):
- content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl

Modules:
- :app
- :list
- :utilities

Build:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Launcher:
- org.example.app.ui.AliasMainActivity

Deep link:
- adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app
