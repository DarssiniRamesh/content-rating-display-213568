Android/Kotlin project discovery:

Workspace root:
- content-rating-display-213568/vod_content_rating_frontend

Primary module:
- :app -> content-rating-display-213568/vod_content_rating_frontend/app

Build:
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Entrypoints:
- org.example.app.ui.AliasMainActivity (MAIN/LAUNCHER)
- org.example.app.ui.IndiceActivity
- org.example.app.ui.PlaybackActivity
- org.example.app.ui.PostPlaybackRatingActivity (deep link: app://rating/postplay)
