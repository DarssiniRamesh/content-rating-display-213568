# Deep Links

You can launch the rating preview directly with:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Optional query to override countdown:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show?countdown=0" org.gradle.experimental.android.app

Notes:
- DeepLinkLauncherActivity handles `app://rating/show` and forwards a seeded RatingInfo to PostPlaybackRatingActivity.
- Use the Índice QA button to start a seeded flow from inside the app without adb.
- Theme: Executive Gray is applied across screens.
