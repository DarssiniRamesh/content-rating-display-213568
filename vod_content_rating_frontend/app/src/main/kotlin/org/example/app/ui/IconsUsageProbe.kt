package org.example.app.ui

import android.content.Context
import androidx.annotation.DrawableRes
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * IconsUsageProbe exposes icon resource IDs via theme-mapped aliases to ensure resources are discoverable.
 */
object IconsUsageProbe {
    // PUBLIC_INTERFACE
    fun getIconIds(context: Context): IntArray {
        @DrawableRes val like = R.drawable.ic_like_placeholder
        @DrawableRes val love = R.drawable.ic_love_placeholder
        @DrawableRes val dislike = R.drawable.ic_dislike_placeholder
        @DrawableRes val close = R.drawable.ic_close_placeholder
        return intArrayOf(like, love, dislike, close)
    }
}
