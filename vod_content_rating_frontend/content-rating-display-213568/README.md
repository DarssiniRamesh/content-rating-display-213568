# Project Repository

This repository contains a multi-module Android project.

Primary Android project root:
- vod_content_rating_frontend (Gradle root)

Android app module path:
- vod_content_rating_frontend/app

Building from repository root:
```bash
cd vod_content_rating_frontend
./gradlew :app:assembleDebug
```

Running instrumentation tests:
```bash
cd vod_content_rating_frontend
./gradlew :app:connectedDebugAndroidTest
```

Android TV entry points:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.tv.TvInstructionsActivity

Quick launch via adb:
```bash
adb shell am start -n org.gradle.experimental.android.app/org.example.app.tv.TvIndexActivity
adb shell am start -n org.gradle.experimental.android.app/org.example.app.tv.TvInstructionsActivity
```
