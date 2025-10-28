# Deep Link and Dev Launch

Deep link preview:
adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Notes:
- DeepLinkLauncherActivity seeds a RatingInfo with TV-MA and descriptors.
- ÍndiceActivity QA button seeds PG-13 with descriptors and a 3s countdown.
- InstruccionesActivity Proceed seeds TV-14 without countdown.
