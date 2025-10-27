package org.example.app.ui

import android.content.Context

// PUBLIC_INTERFACE
object PlaybackInfoUtils {
    /** Formats the info string centered on playback title and ack state. */
    fun formatInfo(ctx: Context, title: String, sep: String, ackLabel: String, ackMark: String): String {
        return "$title$sep$ackLabel: $ackMark"
    }
}
