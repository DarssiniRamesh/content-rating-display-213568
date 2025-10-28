# Build Guide (Workspace)

Workspace root:
- This directory: content-rating-display-213568/vod_content_rating_frontend

Gradle wrapper:
- ./gradlew

Assemble (Debug):
- ./gradlew :app:assembleDebug

From repository root (bridged):
- ./gradlew :content-rating-display-213568:vod_content_rating_frontend:app:assembleDebug

Modules:
- :app
- :list
- :utilities

Launcher:
- org.example.app.ui.IndiceActivity

Deep link:
- app://rating/show
