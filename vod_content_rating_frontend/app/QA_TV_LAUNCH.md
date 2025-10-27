ADB Launch Helpers (Android TV)

# Replace org.gradle.experimental.android.app with actual applicationId if changed.

# Launch TV Index directly:
adb shell am start -n org.gradle.experimental.android.app/org.example.app.tv.TvIndexActivity

# Launch TV Instructions directly:
adb shell am start -n org.gradle.experimental.android.app/org.example.app.tv.TvInstructionsActivity

# Go home:
adb shell input keyevent 3
