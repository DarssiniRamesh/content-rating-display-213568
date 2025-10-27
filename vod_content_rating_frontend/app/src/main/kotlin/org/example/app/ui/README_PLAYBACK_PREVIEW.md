# Playback Preview

- PlaybackActivity auto-opens the Post-Playback Rating panel shortly after launch.
- Timing is controlled by Defaults:
  - DEFAULT_ROLLING_CREDITS_SEC
  - DEFAULT_DISPLAY_TIME_SEC

To disable auto-preview for some tests, comment the postDelayed block or raise the DEFAULT_ROLLING_CREDITS_SEC value in Defaults.
