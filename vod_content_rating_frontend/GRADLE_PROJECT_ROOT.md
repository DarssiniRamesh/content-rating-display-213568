This directory is the Gradle project root (bridge) for discovery tools.

Key pointers:
- Android project root: content-rating-display-213568/vod_content_rating_frontend
- Wrapper: content-rating-display-213568/vod_content_rating_frontend/gradlew
- Settings (Declarative): content-rating-display-213568/vod_content_rating_frontend/settings.gradle.dcl
- Modules: :app, :list, :utilities

Build:
- From repository root (bridge): ./gradlew :app:assembleDebug
- Or:
  cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug
