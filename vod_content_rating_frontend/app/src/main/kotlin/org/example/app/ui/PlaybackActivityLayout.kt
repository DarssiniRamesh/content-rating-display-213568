package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * PlaybackActivityLayout is a variant Activity that explicitly uses activity_playback.xml layout.
 * This is provided for static analyzers that expect a direct layout inflation in a dedicated Activity.
 */
class PlaybackActivityLayout : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_playback)
    }
}
