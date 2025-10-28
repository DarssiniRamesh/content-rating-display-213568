@file:JvmName("UiPackageInfoBridge")

/**
 * PUBLIC_INTERFACE
 * Package marker for org.example.app.ui to assist analyzers in resolving the UI package.
 * References key Activities for discovery.
 */
package org.example.app.ui

@Suppress("unused")
object UiDiscoveryRefs {
    // PUBLIC_INTERFACE
    fun activities() = arrayOf(
        IndiceActivity::class.java.name,
        InstruccionesActivity::class.java.name,
        PlaybackActivity::class.java.name,
        PostPlaybackRatingActivity::class.java.name,
        DeepLinkLauncherActivity::class.java.name,
        AliasMainActivity::class.java.name,
        HomeShortcutActivity::class.java.name
    )
}
