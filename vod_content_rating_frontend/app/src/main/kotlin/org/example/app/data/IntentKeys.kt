package org.example.app.data

// PUBLIC_INTERFACE
object IntentKeys {
    /** Content identifier extra key shared across activities. */
    const val EXTRA_CONTENT_ID = "extra_content_id"
    /** Post-Playback Rating: display time seconds (max 60). */
    const val EXTRA_DISPLAY_TIME_SEC = "extra_display_time_sec"
    /** Current playback position seconds. */
    const val EXTRA_PLAYBACK_POSITION_SEC = "extra_playback_position_sec"
    /** Rolling credits threshold seconds. */
    const val EXTRA_ROLLING_CREDITS_SEC = "extra_rolling_credits_sec"
}

// PUBLIC_INTERFACE
object Defaults {
    /** Default countdown seconds for rating display (<=60). */
    const val DEFAULT_DISPLAY_TIME_SEC = 10
    /** Default rolling credits threshold seconds to show rating. */
    const val DEFAULT_ROLLING_CREDITS_SEC = 3
}
