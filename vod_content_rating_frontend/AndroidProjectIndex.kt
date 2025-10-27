/**
 * PUBLIC_INTERFACE
 * AndroidProjectIndex marks this folder as the Android project root for static analyzers.
 * References key modules and entry activities.
 */
package org.example.app

object AndroidProjectIndex {
    // PUBLIC_INTERFACE
    fun modules() = arrayOf(":app", ":list", ":utilities")
    // PUBLIC_INTERFACE
    fun entries() = arrayOf(
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.PlaybackActivity"
    )
}
