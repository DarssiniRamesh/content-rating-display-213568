/**
 * PUBLIC_INTERFACE
 * PackageIndex helps static analyzers identify the primary Kotlin packages for this Android app.
 *
 * Modules and key packages:
 * - org.example.app.ui: Activities and UI flows (IndiceActivity is launcher)
 * - org.example.app.data: Data models, repository, constants
 */
package org.example.app

object PackageIndex {
    /** Marker method to reference UI and Data packages for analyzers. */
    fun references() = arrayOf(
        "org.example.app.ui.IndiceActivity",
        "org.example.app.ui.PostPlaybackRatingActivity",
        "org.example.app.ui.PlaybackActivity",
        "org.example.app.data.Repository",
        "org.example.app.data.Models"
    )
}
