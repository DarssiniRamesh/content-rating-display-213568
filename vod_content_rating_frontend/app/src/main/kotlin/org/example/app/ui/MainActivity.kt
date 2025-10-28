package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * MainActivity (non-launcher) kept as a stub for analyzer compatibility.
 * Uses Executive Gray theme and shows a minimal layout if present.
 */
class MainActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        val id = resources.getIdentifier("activity_main", "layout", packageName)
        if (id != 0) {
            setContentView(id)
        } else {
            // Fallback to simple playback layout for a concrete view
            setContentView(R.layout.activity_playback)
        }
    }
}
