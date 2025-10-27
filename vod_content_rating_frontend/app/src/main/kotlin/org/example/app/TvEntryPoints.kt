package org.example.app

import org.example.app.tv.TvIndexActivity
import org.example.app.tv.TvInstructionsActivity

/**
 * PUBLIC_INTERFACE
 * TvEntryPoints
 * References to TV Activities to ensure tooling can discover cross-package entry points easily.
 */
object TvEntryPoints {
    // PUBLIC_INTERFACE
    fun indexActivityClass(): Class<*> = TvIndexActivity::class.java
    // PUBLIC_INTERFACE
    fun instructionsActivityClass(): Class<*> = TvInstructionsActivity::class.java
}
