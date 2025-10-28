# Android Project Location

Android workspace:
- content-rating-display-213568/vod_content_rating_frontend

Build:
- From repository root (bridge): ./gradlew :app:assembleDebug
- Or cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Launcher:
- org.example.app.ui.IndiceActivity

Notes:
- Project uses Gradle 9 Declarative (settings.gradle.dcl, build.gradle.dcl).
- Compatibility files are present at repository root to aid analyzers and CI.
