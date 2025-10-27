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
 * TvInstructionsActivity
 * TV-friendly screen that renders the Instrucciones (41:206) using a WebView and
 * provides actions: acknowledge and back to index. DPAD navigation is enabled.
 */
class TvInstructionsActivity : Activity() {

    private lateinit var webView: WebView
    private lateinit var acknowledgeButton: Button
    private lateinit var backToIndexButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_instructions)

        val title = findViewById<TextView>(R.id.tvTitle)
        title.isFocusable = false

        acknowledgeButton = findViewById(R.id.btnAcknowledge)
        acknowledgeButton.isFocusable = true
        acknowledgeButton.isFocusableInTouchMode = true
        acknowledgeButton.contentDescription = getString(R.string.tv_instructions_ack)
        acknowledgeButton.setOnClickListener { continueToNext() }
        acknowledgeButton.setOnKeyListener { _: View, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                continueToNext()
                true
            } else false
        }

        backToIndexButton = findViewById(R.id.btnBackToIndex)
        backToIndexButton.isFocusable = true
        backToIndexButton.isFocusableInTouchMode = true
        backToIndexButton.setOnClickListener { returnToIndex() }
        backToIndexButton.setOnKeyListener { _: View, keyCode: Int, event: KeyEvent ->
            if (event.action == KeyEvent.ACTION_DOWN &&
                (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                returnToIndex()
                true
            } else false
        }

        webView = findViewById(R.id.webInstructions)
        prepareTvWebView(webView)
        webView.loadUrl(WebViewAssetLoaderHelper.url("instrucciones-41-206.html"))

        // Start focus at acknowledge button
        acknowledgeButton.requestFocus()
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
    }

    private fun continueToNext() {
        // Stub "next" step: for now, return to Index screen.
        val intent = Intent(this, TvIndexActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }

    private fun returnToIndex() {
        val intent = Intent(this, TvIndexActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }
}
