# Deep Link Testing

Launch the rating preview via deep link:
adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Expected:
- PostPlaybackRatingActivity opens with a sample RatingInfo (TV-MA, descriptors).
- Acknowledge is disabled for 3s, then enabled and returns to PlaybackActivity.
