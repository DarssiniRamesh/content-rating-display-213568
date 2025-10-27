package org.example.app.tv

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import org.example.app.R
import org.example.app.tv.web.WebViewAssetLoaderHelper

/**
 * PUBLIC_INTERFACE
 * TvIndexActivity
 * A TV-first landing activity that renders the Índice (41:135) design.
 * - Shows a large title and DPAD-focusable actions.
 * - Loads the provided Índice HTML into a WebView adapted for TV (DPAD enabled).
 * - Navigates to TvInstructionsActivity or TvAboutActivity via actions.
 */
class TvIndexActivity : Activity() {

    private lateinit var webView: WebView
    private lateinit var primaryButton: Button
    private lateinit var aboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_index)

        val title = findViewById<TextView>(R.id.tvTitle)
        title.isFocusable = false

        primaryButton = findViewById(R.id.btnPrimary)
        primaryButton.isFocusable = true
        primaryButton.isFocusableInTouchMode = true
        primaryButton.contentDescription = getString(R.string.tv_index_continue)
        primaryButton.setOnClickListener { goToInstructions() }
        primaryButton.setOnKeyListener { _: View, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                goToInstructions()
                true
            } else {
                false
            }
        }

        aboutButton = findViewById(R.id.btnAbout)
        aboutButton.isFocusable = true
        aboutButton.isFocusableInTouchMode = true
        aboutButton.setOnClickListener { goToAbout() }
        aboutButton.setOnKeyListener { _: View, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                goToAbout()
                true
            } else false
        }

        webView = findViewById(R.id.webIndex)
        prepareTvWebView(webView)
        webView.loadUrl(WebViewAssetLoaderHelper.url("ndice-41-135.html"))

        // Ensure initial focus is on the primary button for TV controls
        primaryButton.requestFocus()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun prepareTvWebView(wv: WebView) {
        with(wv.settings) {
            javaScriptEnabled = true
            domStorageEnabled = true
            cacheMode = WebSettings.LOAD_DEFAULT
            mediaPlaybackRequiresUserGesture = false
            builtInZoomControls = false
            displayZoomControls = false
            useWideViewPort = true
            loadWithOverviewMode = true
        }
        wv.isFocusable = true
        wv.isFocusableInTouchMode = true
        wv.setBackgroundColor(Color.TRANSPARENT)
        wv.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN) {
                when (keyCode) {
                    KeyEvent.KEYCODE_DPAD_DOWN, KeyEvent.KEYCODE_DPAD_UP,
                    KeyEvent.KEYCODE_DPAD_LEFT, KeyEvent.KEYCODE_DPAD_RIGHT -> return@setOnKeyListener false
                    else -> return@setOnKeyListener false
                }
            }
            false
        }
    }

    private fun goToInstructions() {
        startActivity(Intent(this, TvInstructionsActivity::class.java))
    }

    private fun goToAbout() {
        startActivity(Intent(this, TvAboutActivity::class.java))
    }
}
