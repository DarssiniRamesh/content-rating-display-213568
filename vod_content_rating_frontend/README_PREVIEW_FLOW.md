# Rating Preview Flow - Workspace

Entry points:
- Launcher: org.example.app.ui.AliasMainActivity → forwards to ÍndiceActivity
- Índice → Instrucciones → Proceed → PostPlaybackRatingActivity
- Deep link: app://rating/show → DeepLinkLauncherActivity → PostPlaybackRatingActivity
- QA: Índice button “Start Playback” and “Open Rating (Dev)” launch the rating preview quickly

What the screen shows:
- Title, rating badge/icon (code + label), advisory text
- Content descriptors (as Executive Gray chips)
- Optional countdown that disables Acknowledge until it reaches 0
- Acknowledge navigates to PlaybackActivity placeholder

Build:
- ./gradlew :app:assembleDebug

Notes:
- Executive Gray theme applied across screens
- Missing/empty values handled gracefully (key literals or preserved layout space)
