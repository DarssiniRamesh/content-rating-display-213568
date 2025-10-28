package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * PlaybackActivity is a simple placeholder screen for preview with Executive Gray styling.
 */
class PlaybackActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_playback)
    }
}
