package org.example.app

// PUBLIC_INTERFACE
object AppMarker {
    /** Marker for tooling discovery; confirms app module presence. */
    fun present(): Boolean = true
}
