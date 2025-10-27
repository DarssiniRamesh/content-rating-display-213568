Android Gradle root for CI/analyzers

Use this directory as the Gradle root:
content-rating-display-213568/vod_content_rating_frontend

Commands:
  ./gradlew :app:assembleDebug
  ./gradlew test

Notes:
- TV entrypoint: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- Layouts for TV are under res/layout-tv/
- WebView assets are in app/src/main/assets/
