package org.example.app.ui

/**
 * PUBLIC_INTERFACE
 * UiPackageIndex lists important UI entry points for analyzers and tooling.
 */
object UiPackageIndex {
    // PUBLIC_INTERFACE
    fun activities() = arrayOf(
        IndiceActivity::class.java.name,
        InstruccionesActivity::class.java.name,
        PostPlaybackRatingActivity::class.java.name,
        PlaybackActivity::class.java.name,
        DeepLinkLauncherActivity::class.java.name,
        DeepLinkHelpActivity::class.java.name,
        AboutActivity::class.java.name
    )
}
