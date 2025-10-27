# Build Instructions - :app module

From repository root:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

From repository root with helper:
- ./build-android-tv.sh

Install on a connected device/emulator:
- ./build-and-install-android-tv.sh

Launch on Android TV:
- adb shell monkey -p org.gradle.experimental.android.app -c android.intent.category.LEANBACK_LAUNCHER 1
