# Build Guide

Android project root:
- content-rating-display-213568/vod_content_rating_frontend

Build (from Android project root):
- ./gradlew :app:assembleDebug

Entry point:
- org.example.app.ui.IndiceActivity (declared in app/src/main/AndroidManifest.xml)

Notes:
- Uses Gradle 9 Declarative DSL (.dcl).
- Modules: app (application), list (library), utilities (library).
