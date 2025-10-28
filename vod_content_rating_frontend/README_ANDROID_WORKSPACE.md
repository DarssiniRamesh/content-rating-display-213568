# Android Workspace Pointer

Android Gradle workspace:
- content-rating-display-213568/vod_content_rating_frontend

Build:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Launcher:
- org.example.app.ui.IndiceActivity

Deep link:
- app://rating/show (DeepLinkLauncherActivity -> PostPlaybackRatingActivity)
