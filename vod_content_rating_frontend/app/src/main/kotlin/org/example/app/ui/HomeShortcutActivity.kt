package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * HomeShortcutActivity inflates a minimal Executive Gray styled view for previews.
 */
class HomeShortcutActivity : AppCompatActivity() {

    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(R.layout.activity_home_shortcut)
    }
}
