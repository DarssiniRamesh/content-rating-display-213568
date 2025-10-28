package org.example.app

/**
 * PUBLIC_INTERFACE
 * PackageIndex helps static analyzers identify the primary Kotlin packages for this Android app.
 *
 * Modules and key packages:
 * - org.example.app.ui: Activities and UI flows (IndiceActivity is launcher)
 * - org.example.app.data: Data models and intent keys
 */
object PackageIndex {
    /** Marker method to reference UI and Data packages for analyzers. */
    fun references() = arrayOf(
        "org.example.app.ui.AliasMainActivity",
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.InstruccionesActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.DeepLinkLauncherActivity",
        "org.example.app.data.IntentKeys",
        "org.example.app.data.RatingInfo"
    )
}
