# Deep Links (App Module)

Use the following to launch the rating preview directly:

adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Notes:
- The deep link is handled by DeepLinkLauncherActivity and seeds a sample RatingInfo model.
- You can also use the Índice screen QA button or the RatingPreviewEntryActivity launcher entry.
