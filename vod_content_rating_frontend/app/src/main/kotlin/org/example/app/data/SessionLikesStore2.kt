package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * Alternate session store helper to allow reset during preview/QA from UI code.
 *
 * This wraps RatedStore.Session and provides a reset() function that clears the in-memory set.
 */
object SessionLikesStore2 {

    /**
     * PUBLIC_INTERFACE
     * Clears the session-rated state so the rating panel can be shown again for the same content.
     */
    fun reset() {
        try {
            val session = RatedStore.Session
            val field = session::class.java.getDeclaredField("set")
            field.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            (field.get(session) as? MutableSet<String>)?.clear()
        } catch (_: Throwable) {
            // ignore in preview/QA
        }
    }
}
