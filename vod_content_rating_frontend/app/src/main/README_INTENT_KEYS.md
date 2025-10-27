# Intent Keys (Shared)

Centralized in: org.example.app.data.IntentKeys

Extras:
- EXTRA_CONTENT_ID (String): Content identifier.
- EXTRA_DISPLAY_TIME_SEC (Int): Countdown seconds (1..60). Default 10.
- EXTRA_PLAYBACK_POSITION_SEC (Int): Current playback position in seconds.
- EXTRA_ROLLING_CREDITS_SEC (Int): Threshold in seconds to show post-playback rating (default 3).

Usage:
- PlaybackActivity: puts all four extras when launching PostPlaybackRatingActivity.
- PostPlaybackRatingActivity: reads all four and applies business rules.

Note:
- Do not hardcode these strings. Always use IntentKeys.* constants.
