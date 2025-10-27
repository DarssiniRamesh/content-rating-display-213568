Android Gradle project root

The Android/TV Gradle project lives here:
- vod_content_rating_frontend/

Build from this folder (Android root):
- cd vod_content_rating_frontend
- ./gradlew :app:assembleDebug

If invoked from repository root, use:
- ./gradlew -p content-rating-display-213568/vod_content_rating_frontend :app:assembleDebug
