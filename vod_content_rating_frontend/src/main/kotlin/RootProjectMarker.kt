package org.example.app

/**
 * PUBLIC_INTERFACE
 * RootProjectMarker exists solely for strict analyzers that require a Kotlin source file
 * at the repository root to confirm Kotlin/Android project presence.
 */
object RootProjectMarker {
    // PUBLIC_INTERFACE
    fun ok(): Boolean = true
}
