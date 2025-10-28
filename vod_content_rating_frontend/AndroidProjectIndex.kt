package org.example.app

/**
 * PUBLIC_INTERFACE
 * AndroidProjectIndex (root bridge)
 *
 * Bridges analyzer discovery at repository root by referencing
 * the canonical Android entry activities and modules.
 */
object AndroidProjectIndexBridge {
    // PUBLIC_INTERFACE
    fun modules() = arrayOf(":app", ":list", ":utilities")

    // PUBLIC_INTERFACE
    fun entries() = arrayOf(
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.PlaybackActivity",
        "org.example.app.ui.DeepLinkLauncherActivity",
        "org.example.app.ui.AliasMainActivity"
    )
}
