# Deep Link Usage

Launch the rating preview directly:

adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

This opens DeepLinkLauncherActivity, which forwards to PostPlaybackRatingActivity with a sample RatingInfo.
