package org.example.app.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * DeepLinkHelpActivity
 *
 * Shows instructions for launching the deep link for preview.
 */
class DeepLinkHelpActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        val tv = TextView(this).apply {
            text = getString(R.string.deeplink_help_instructions)
            setTextColor(resources.getColor(R.color.eg_text, theme))
            textSize = 16f
            setPadding(24, 24, 24, 24)
        }
        setContentView(tv)
    }
}
