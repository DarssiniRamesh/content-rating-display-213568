# Android Project Discovery Index

Canonical Android workspace:
- content-rating-display-213568/vod_content_rating_frontend

Primary settings (Declarative Gradle):
- content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl

Gradle wrapper:
- content-rating-display-213568/vod_content_rating_frontend/gradlew

Modules:
- :app, :list, :utilities

Launcher Activity:
- org.example.app.ui.IndiceActivity

Build:
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
- Or from repo root: ./gradlew :app:assembleDebug (includeBuild bridge)

Additional pointers:
- android.json
- ANDROID_WORKSPACE_ROOT.txt
- ANDROID_ROOT_POINTER.json
- ANDROID_PROJECT_ROOT.marker
- android-workspace.json
- android-workspace-probe.json
- ANDROID_PROJECT_ROOT_POINTER.md
- settings.gradle / settings.gradle.kts includeBuild bridge
