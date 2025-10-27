package org.example.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import org.example.app.tv.TvIndexActivity
import org.example.app.tv.TvInstructionsActivity

/**
 * PUBLIC_INTERFACE
 * DebugLauncherActivity
 * Simple debug-only screen with buttons to start TV flows manually.
 */
class DebugLauncherActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = ScrollView(this).apply {
            addView(LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                val btnTvIndex = Button(context).apply {
                    text = "Abrir Índice (TV)"
                    setOnClickListener {
                        startActivity(Intent(context, TvIndexActivity::class.java))
                    }
                }
                val btnTvInstructions = Button(context).apply {
                    text = "Abrir Instrucciones (TV)"
                    setOnClickListener {
                        startActivity(Intent(context, TvInstructionsActivity::class.java))
                    }
                }
                addView(btnTvIndex)
                addView(btnTvInstructions)
            })
        }
        setContentView(root)
    }
}
