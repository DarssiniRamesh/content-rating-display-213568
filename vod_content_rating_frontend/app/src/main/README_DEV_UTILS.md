# Dev Utilities

This app includes small developer/QA utilities to ease verification of business rules:

- DevLaunchRatingActivity
  - Launches the Post-Playback Rating panel directly with safe default extras.
  - Intent action: android.intent.action.VIEW
  - Useful for UI smoke checks.

- DevRewindPlaybackActivity
  - Simulates leaving the rating screen, rewinding before credits, and reaching credits again.
  - Verifies:
    * Skip screen if already rated
    * Don’t show when playback is before rolling credits
    * Show again after rewinding and reaching credits

Both are declared as exported=true for analyzer convenience. For production, remove or guard behind debug flags.
