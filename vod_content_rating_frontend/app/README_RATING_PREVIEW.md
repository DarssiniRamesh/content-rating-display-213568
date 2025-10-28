# Rating Preview (Developer Notes)

- Launcher: ÍndiceActivity (MAIN/LAUNCHER)
- QA: overflow menu → Start Playback (opens Playback placeholder)
- Instrucciones → Proceed → opens rating without countdown
- Deep link: `adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app`
- Developer quick launch: DevLaunchRatingActivity

Acceptance criteria mapping:
- Title, rating badge/icon, code/label, advisory, descriptors: shown on PostPlaybackRatingActivity.
- Countdown: Acknowledge disabled until countdown completes if `requireCountdown=true`.
- Acknowledge: navigates to PlaybackActivity placeholder.
- Executive Gray: applied via Theme.ExecutiveGray / Theme_ExecutiveGray_AppCompat.
- Strings: missing keys show literals; empty keys keep spacing.
