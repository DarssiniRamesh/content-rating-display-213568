package org.example.list

// PUBLIC_INTERFACE
object BuildMarker {
    /** Marker utility to confirm the list module is part of the build graph. */
    fun present(): Boolean = true
}
