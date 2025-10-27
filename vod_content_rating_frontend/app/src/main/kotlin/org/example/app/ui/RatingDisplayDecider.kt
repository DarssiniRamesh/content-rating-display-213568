package org.example.app.ui

import org.example.app.data.Defaults

// PUBLIC_INTERFACE
object RatingDisplayDecider {
    /**
     * Returns true if the rating panel should be shown based on current playback position and credits start.
     * - Not shown if playback position is before rolling credits.
     */
    fun shouldShow(playbackPosSec: Int, rollingCreditsSec: Int = Defaults.DEFAULT_ROLLING_CREDITS_SEC): Boolean {
        return playbackPosSec >= rollingCreditsSec
    }
}
