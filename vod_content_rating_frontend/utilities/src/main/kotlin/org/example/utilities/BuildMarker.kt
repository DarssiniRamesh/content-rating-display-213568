package org.example.utilities

// PUBLIC_INTERFACE
object BuildMarker {
    /** Marker utility to confirm the utilities module is part of the build graph. */
    fun present(): Boolean = true
}
