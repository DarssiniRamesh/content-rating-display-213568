Android TV Quickstart

Gradle root (run all commands here):
  content-rating-display-213568/vod_content_rating_frontend

Build:
  ./gradlew build

Assemble and install:
  ./gradlew :app:assembleDebug :app:installDebug

Run instrumentation tests:
  ./gradlew connectedAndroidTest

TV entry activity:
  org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)

Notes:
- DPAD focus defaults to the primary button on each TV screen.
- WebViews load assets from app/src/main/assets (file:///android_asset/).
- If invoking from repository root, use build-android-tv.sh or run-nested-gradle.sh.
