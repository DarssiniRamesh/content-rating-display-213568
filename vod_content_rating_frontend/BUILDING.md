# Building this repository

The Android Gradle root is located at:
content-rating-display-213568/vod_content_rating_frontend

Quick commands:

Build Debug APK:
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:assembleDebug
```

Run unit tests:
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:testDebugUnitTest
```

Run instrumentation tests (requires device/emulator):
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:connectedDebugAndroidTest
```

Android TV launcher Activities:
- org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- org.example.app.tv.TvInstructionsActivity
