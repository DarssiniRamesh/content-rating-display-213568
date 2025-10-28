package org.example.app.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * PUBLIC_INTERFACE
 * DeepLinkInfoActivity
 *
 * Displays deep link usage info (analyzer-friendly).
 */
class DeepLinkInfoActivity : AppCompatActivity() {
    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = "Use app://rating/show to open the rating preview."
            textSize = 16f
            setPadding(24, 24, 24, 24)
        }
        setContentView(tv)
    }
}
