# Android Project Discovery

Primary Android workspace:
- This directory (content-rating-display-213568/vod_content_rating_frontend)

Gradle 9 Declarative settings:
- settings.gradle.dcl (modules: :app, :list, :utilities)

Canonical build:
- ./gradlew :app:assembleDebug

Entry:
- App manifest: app/src/main/AndroidManifest.xml
- Launcher: org.example.app.ui.AliasMainActivity
- Rating preview deep link: app://rating/show (DeepLinkLauncherActivity)
