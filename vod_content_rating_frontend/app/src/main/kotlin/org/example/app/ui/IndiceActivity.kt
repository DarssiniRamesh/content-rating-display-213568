package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * ÍndiceActivity displays the index screen per Figma "Índice".
 * - Shows a brief description and a CTA button to start prototype 1.
 * - Navigates to InstruccionesActivity with a contentId extra.
 */
class IndiceActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indice)

        val title: TextView = findViewById(R.id.indiceTitle)
        val body: TextView = findViewById(R.id.indiceBody)
        val cta1: Button = findViewById(R.id.ctaPrototype1)
        val hint: TextView = findViewById(R.id.ctaHint)

        title.text = getString(R.string.title_indice)
        body.text = getString(R.string.indice_intro_body)
        cta1.text = getString(R.string.indice_cta1)
        cta1.contentDescription = getString(R.string.accessibility_action_start)
        hint.text = getString(R.string.indice_cta_hint)

        val contentId = "prototype_1" // could be dynamic; fixed for this initial flow

        cta1.setOnClickListener {
            val intent = Intent(this, InstruccionesActivity::class.java)
            intent.putExtra(InstruccionesActivity.EXTRA_CONTENT_ID, contentId)
            startActivity(intent)
        }

        // Hide extra CTAs not implemented yet (aligns with "prioritize end-to-end")
        findViewById<View>(R.id.ctaPrototype2).visibility = View.GONE
        findViewById<View>(R.id.ctaPrototype3).visibility = View.GONE
    }
}
