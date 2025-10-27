package org.example.app.ui

import org.example.app.R
import org.example.app.data.ApaAssets

/**
 * PUBLIC_INTERFACE
 * Resolves logical icon names to drawable resource IDs using the APA assets map.
 * Falls back to local placeholder drawables.
 */
object IconResolver {
    // PUBLIC_INTERFACE
    fun resolveDrawableId(name: String?, assets: ApaAssets?): Int {
        val key = name ?: return fallback(name)
        // In a real implementation, assets.iconMap values could be remote names -> mapped to local resources.
        return when (assets?.iconMap?.get(key) ?: key) {
            "ic_like_placeholder", "like" -> R.drawable.ic_like_placeholder
            "ic_love_placeholder", "love" -> R.drawable.ic_love_placeholder
            "ic_dislike_placeholder", "dislike" -> R.drawable.ic_dislike_placeholder
            "ic_close_placeholder", "close" -> R.drawable.ic_close_placeholder
            else -> fallback(key)
        }
    }

    private fun fallback(name: String?): Int {
        return when (name) {
            "like" -> R.drawable.ic_like_placeholder
            "love" -> R.drawable.ic_love_placeholder
            "dislike" -> R.drawable.ic_dislike_placeholder
            "close" -> R.drawable.ic_close_placeholder
            else -> R.drawable.ic_close_placeholder
        }
    }
}
