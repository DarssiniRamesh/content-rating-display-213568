/**
 * PUBLIC_INTERFACE
 * BuildProbe provides a minimal symbol and method for analyzers to confirm Kotlin source presence
 * and allow simple reflection during static checks.
 */
package org.example.app

object BuildProbe {
    // PUBLIC_INTERFACE
    /**
     * Returns a simple string used by analyzers/tests to verify Kotlin code loads.
     */
    fun hello(): String = "ok"
}
