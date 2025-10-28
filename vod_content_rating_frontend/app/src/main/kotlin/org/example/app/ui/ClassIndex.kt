package org.example.app.ui

/**
 * PUBLIC_INTERFACE
 * ClassIndex provides string references to the main Activities for discovery tools.
 */
object ClassIndex {
    // PUBLIC_INTERFACE
    fun activities() = arrayOf(
        AliasMainActivity::class.java.name,
        IndiceActivity::class.java.name,
        InstruccionesActivity::class.java.name,
        PlaybackActivity::class.java.name,
        PostPlaybackRatingActivity::class.java.name,
        DeepLinkLauncherActivity::class.java.name
    )
}
