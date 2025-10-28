package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * IndiceActivity2
 *
 * Secondary index stub retained for analyzer references.
 */
class IndiceActivity2 : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Reuse the preview layout
        setContentView(resources.getIdentifier("activity_indice_preview", "layout", packageName))
    }
}
