# Android Build (Root Bridge)

Android workspace:
- content-rating-display-213568/vod_content_rating_frontend

Build:
- ./gradlew :content-rating-display-213568:vod_content_rating_frontend:app:assembleDebug
or
- cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug

Launcher:
- org.example.app.ui.AliasMainActivity

Deep link:
- app://rating/show (DeepLinkLauncherActivity)
