package org.example.app

/**
 * PUBLIC_INTERFACE
 * AppModuleIndex provides discoverable references to the app's main activities.
 */
object AppModuleIndex {
    // PUBLIC_INTERFACE
    fun entryActivities() = arrayOf(
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.InstruccionesActivity",
        "org.example.app.ui.PlaybackActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.DeepLinkLauncherActivity",
        "org.example.app.ui.DevLaunchRatingActivity",
        "org.example.app.ui.AliasMainActivity"
    )
}
