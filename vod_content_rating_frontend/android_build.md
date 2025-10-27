# Android Build

Gradle root:
- content-rating-display-213568/vod_content_rating_frontend

Primary module:
- :app

Build:
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:assembleDebug
```

Unit tests:
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:testDebugUnitTest
```

Connected tests:
```bash
cd content-rating-display-213568/vod_content_rating_frontend
./gradlew :app:connectedDebugAndroidTest
```
