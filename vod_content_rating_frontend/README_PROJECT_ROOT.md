# Project Root

Android workspace is located at:
- content-rating-display-213568/vod_content_rating_frontend

How to build:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Key files:
- settings.gradle.dcl (Declarative Gradle)
- app/src/main/AndroidManifest.xml
- Launcher: org.example.app.ui.AliasMainActivity
- Deep link preview: app://rating/show -> DeepLinkLauncherActivity
