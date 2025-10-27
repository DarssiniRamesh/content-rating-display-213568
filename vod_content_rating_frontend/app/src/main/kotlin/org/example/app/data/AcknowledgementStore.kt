package org.example.app.data

// PUBLIC_INTERFACE
object AcknowledgementStore {
    /** Simple in-memory acknowledgment flags keyed by contentId for the session. */
    private val acknowledged: MutableSet<String> = mutableSetOf()

    // PUBLIC_INTERFACE
    fun isAcknowledged(contentId: String): Boolean = acknowledged.contains(contentId)

    // PUBLIC_INTERFACE
    fun setAcknowledged(contentId: String, value: Boolean) {
        if (value) acknowledged.add(contentId) else acknowledged.remove(contentId)
    }
}
