package org.example.app.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * QaStartPlaybackActivity starts the playback placeholder immediately.
 */
class QaStartPlaybackActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, PlaybackActivity::class.java))
        finish()
    }
}
