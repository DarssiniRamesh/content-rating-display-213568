Android/Kotlin Project Build Root

The Android Gradle project lives at:
  content-rating-display-213568/vod_content_rating_frontend

How to build:
  cd content-rating-display-213568/vod_content_rating_frontend
  ./gradlew build

Modules:
  :app, :list, :utilities

Notes:
- The repository root includes forwarding helpers (gradlew, Makefile, scripts) but some analyzers still require you to cd into the nested root above.
- TV entry activity: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
