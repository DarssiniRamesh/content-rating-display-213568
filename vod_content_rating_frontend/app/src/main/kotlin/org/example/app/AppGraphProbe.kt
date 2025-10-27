/**
 * PUBLIC_INTERFACE
 * AppGraphProbe references key Activities, layouts, and strings to anchor the module graph.
 * This assists strict analyzers in resolving the Android app structure.
 */
package org.example.app

import org.example.app.ui.IndiceActivity
import org.example.app.ui.InstruccionesActivity
import org.example.app.ui.PlaybackActivity
import org.example.app.ui.PostPlaybackRatingActivity
import org.example.app.R

object AppGraphProbe {
    // PUBLIC_INTERFACE
    fun activities() = arrayOf(
        IndiceActivity::class.java.name,
        InstruccionesActivity::class.java.name,
        PlaybackActivity::class.java.name,
        PostPlaybackRatingActivity::class.java.name
    )

    // PUBLIC_INTERFACE
    fun resources() = intArrayOf(
        R.layout.activity_indice,
        R.layout.activity_instrucciones,
        R.layout.activity_playback,
        R.layout.activity_post_playback_rating,
        R.string.app_name,
        R.string.rating_title
    )
}
