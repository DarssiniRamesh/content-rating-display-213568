package org.example.app

/**
 * PUBLIC_INTERFACE
 * Centralized defaults and limits for the Post-Playback rating feature.
 *
 * MAX_DISPLAY_TIME_SEC: upper bound for the countdown (spec: up to 60s).
 * DEFAULT_DISPLAY_TIME_SEC: applied when callers omit the timer (spec: configurable; we default to 10s).
 * DEFAULT_ROLLING_CREDITS_TIME_SEC: default threshold to represent 'credits started'.
 */
object Constants {
    /** Maximum allowed display time for the rating panel (seconds). */
    const val MAX_DISPLAY_TIME_SEC: Int = 60

    /** Default display time for the rating panel when not specified (seconds). */
    const val DEFAULT_DISPLAY_TIME_SEC: Int = 10

    /** Default rolling credits starting time (seconds). */
    const val DEFAULT_ROLLING_CREDITS_TIME_SEC: Int = 3
}
