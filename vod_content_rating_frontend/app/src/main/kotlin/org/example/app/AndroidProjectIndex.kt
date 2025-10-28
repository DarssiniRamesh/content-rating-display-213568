package org.example.app

/**
 * PUBLIC_INTERFACE
 * AndroidProjectIndex marks the app module as containing the main Activities.
 * This helps static analyzers and tools quickly discover entry classes.
 */
object AndroidProjectIndex {
    // PUBLIC_INTERFACE
    fun entries() = arrayOf(
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.InstruccionesActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.PlaybackActivity",
        "org.example.app.ui.DeepLinkLauncherActivity"
    )
}
