# Rating Preview Verification Guide

Acceptance Criteria Checklist
1) Screen shows: title, rating badge/icon, rating code/label, advisory text, descriptors list when provided.
2) Acknowledge disabled until countdown completes (when `requireCountdown=true`).
3) Acknowledge navigates to PlaybackActivity placeholder.
4) Deep link `app://rating/show` launches PostPlaybackRatingActivity with sample parameters.
5) Executive Gray theme is applied.
6) Build succeeds with no resource merge or missing reference errors.

Launch Options
- Launcher: ÍndiceActivity (MAIN/LAUNCHER)
  - Use the "Start Playback" (QA) button to open the rating preview with seeded data.
  - Tap the title to open Instrucciones, then press Proceed to open the rating preview (no countdown scenario).
- Deep Link:
  adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

What to See
- Icon + Title row at top of the card.
- Code/Label badge under the invitation text (e.g., "PG-13 • Parents Strongly Cautioned").
- Advisory text (null -> shows key literal; empty -> preserves spacing).
- Descriptors header "Content descriptors" and bullet list (if provided).
- Countdown label "Available in" and a seconds display that decrements to 0.
- Acknowledge button is disabled during countdown and enabled at 0, returning to PlaybackActivity on press.

Notes
- Sample descriptors: Violence, Language, Smoking (see res/raw/sample_descriptors.txt).
- The preview uses Executive Gray style tokens for consistent UI across screens.
