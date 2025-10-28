# Android Build (Workspace Pointer)

Canonical Android workspace:
- content-rating-display-213568/vod_content_rating_frontend

Build from repository root (bridge):
- ./gradlew :app:assembleDebug

Build from Android workspace:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Launcher Activity:
- org.example.app.ui.IndiceActivity

Notes:
- Project uses Gradle 9 Declarative (settings.gradle.dcl).
- Deep link for rating preview: app://rating/show
