package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * SessionLikesStore provides a simple global reset API used by the playback menu.
 */
object SessionLikesStore {
    private val internal = InMemoryRatedStore()

    // PUBLIC_INTERFACE
    fun reset() {
        // No-op placeholder in preview; would clear rated set if wired.
        // Kept to satisfy reflection in PlaybackActivity.
    }
}
