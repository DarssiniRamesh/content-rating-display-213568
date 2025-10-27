Nested Android Project

Location:
- content-rating-display-213568/vod_content_rating_frontend

Build (from repo root):
- ./android_build.sh
- or cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Gradle root pointers provided:
- settings.gradle (Groovy proxy including nested build)
- settings.gradle.kts (Kotlin proxy including nested build)
- settings.include-android.kts (alternative includeBuild)
- GRADLE_SETTINGS_PATH.txt, ANDROID_GRADLE_PROJECT_PATH.txt (plain text pointers)
- gradlew-android-tv, build-android-tv.sh (shell helpers)
