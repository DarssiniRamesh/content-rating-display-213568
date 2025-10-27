Deep Link

To open the TV flow via MainActivity on environments that only start the mobile launcher:

adb shell am start -a android.intent.action.VIEW -d "app://tvindex" org.gradle.experimental.android.app
