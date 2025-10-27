package org.example.app

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import org.example.app.tv.TvIndexActivity
import org.example.app.tv.TvInstructionsActivity

/**
 * PUBLIC_INTERFACE
 * DeepLinkTvActivity
 * Debug-only deep link screen to launch TV Index or Instrucciones flows directly.
 */
class DeepLinkTvActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = ScrollView(this).apply {
            addView(LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                val btnIndex = Button(context).apply {
                    text = "Deep link: Índice (TV)"
                    setOnClickListener {
                        startActivity(Intent(context, TvIndexActivity::class.java))
                    }
                }
                val btnInstructions = Button(context).apply {
                    text = "Deep link: Instrucciones (TV)"
                    setOnClickListener {
                        startActivity(Intent(context, TvInstructionsActivity::class.java))
                    }
                }
                addView(btnIndex)
                addView(btnInstructions)
            })
        }
        // If launched via app://tv/instructions deep link, immediately open Instrucciones
        intent?.data?.let { uri: Uri ->
            if (uri.scheme == "app" && uri.host == "tv" && uri.path == "/instructions") {
                startActivity(Intent(this, TvInstructionsActivity::class.java))
                finish()
                return
            }
        }
        setContentView(root)
    }
}
