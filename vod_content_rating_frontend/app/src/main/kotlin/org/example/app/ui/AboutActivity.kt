package org.example.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * AboutActivity - simple placeholder for menu/About entries in previews.
 */
class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ExecutiveGray_AppCompat)
        setContentView(android.R.layout.simple_list_item_1)
    }
}
