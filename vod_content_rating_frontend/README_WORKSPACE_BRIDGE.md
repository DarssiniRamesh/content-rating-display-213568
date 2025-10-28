# Workspace Bridge (Repository Root)

If your tool starts at the repository root and looks for a Gradle project here, use the bridge:

- settings.gradle / settings.gradle.kts includeBuild to:
  content-rating-display-213568/vod_content_rating_frontend

Build from repo root:
- ./gradlew :app:assembleDebug

Canonical Android workspace:
- content-rating-display-213568/vod_content_rating_frontend
- Wrapper: content-rating-display-213568/vod_content_rating_frontend/gradlew
- Settings (Declarative): content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl
