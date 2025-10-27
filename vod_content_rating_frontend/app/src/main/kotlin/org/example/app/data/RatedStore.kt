package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * Abstraction for tracking whether a user has already rated a given contentId.
 *
 * Contract:
 * - isRated(contentId): Returns true if the content is already rated in the current scope.
 * - markRated(contentId): Marks the content as rated so the rating panel can be skipped.
 *
 * Implementations:
 * - Session: In-memory session-scoped implementation for previews and local runs.
 */
interface RatedStore {
    /** Returns true if the contentId is marked as rated in this store. */
    fun isRated(contentId: String): Boolean

    /** Marks the contentId as rated. */
    fun markRated(contentId: String)

    /**
     * PUBLIC_INTERFACE
     * Session-scoped implementation.
     * Uses an in-memory set to keep state during app runtime.
     *
     * Notes:
     * - This is volatile and resets when the process restarts.
     * - Intended for previews/QA; replace with persistent store if needed.
     */
    object Session : RatedStore {
        private val set: MutableSet<String> = mutableSetOf()

        override fun isRated(contentId: String): Boolean = set.contains(contentId)

        override fun markRated(contentId: String) {
            set.add(contentId)
        }
    }
}
