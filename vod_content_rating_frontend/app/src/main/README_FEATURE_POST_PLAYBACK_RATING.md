# Post-Playback Rating Feature

This module implements an end-to-end Post-Playback rating screen with a PIP-style layout, countdown timer, and D-pad focus defaults.

Entry points:
- Launcher: org.example.app.ui.IndiceActivity
- Flow: Índice → Instrucciones (ack) → Playback → PostPlaybackRatingActivity (auto-launch after credits)
- Deep link: app://rating/show?contentId=prototype_1&display=10&pos=3&credits=3

Core classes:
- ui/PostPlaybackRatingActivity.kt: Activity implementation
- ui/PlaybackActivity.kt: Placeholder playback and launching of rating
- data/Repository.kt: Stubs for /content, /apa/metadata, /apa/assets, /likes
- data/Models.kt: Data models and interfaces

Business rules:
- Skip if already rated.
- Don’t show if playback closed before rollingCreditsTime.
- Auto-close after display_time (max 60s).
- If closed and user rewinds before rollingCreditsTime, show again when relaunched.
- Missing key → show the key name literal; empty key → preserve layout with empty text.

UI:
- PIP: pipPlayerSurface (placeholder)
- Title: contentTitle (single line, ellipsized)
- Invitation: invitationCopy
- Buttons: Like, Love, Dislike, Close (default focus on Close)
- Countdown: countdownText

Build:
- Use workspace Gradle wrapper: ./gradlew :app:assembleDebug
