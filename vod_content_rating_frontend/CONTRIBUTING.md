# Contributing

This directory is the Android Gradle project root:
content-rating-display-213568/vod_content_rating_frontend

Build:
- ./gradlew :app:assembleDebug

Run unit tests:
- ./gradlew test

Project layout:
- app/ (Android application module)
- list/ (library)
- utilities/ (library)
- settings.gradle.dcl defines modules

Android TV entrypoints:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.tv.TvInstructionsActivity

Assets:
- app/src/main/assets/ (HTML/CSS/JS + images)
- TV layouts under res/layout-tv/

Notes:
- DPAD navigation is implemented; buttons have visible focus states and default focus.
- WebView is configured for TV and loads local assets via file:///android_asset/.
