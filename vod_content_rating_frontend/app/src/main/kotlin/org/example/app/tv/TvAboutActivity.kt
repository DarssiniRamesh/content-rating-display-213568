package org.example.app.tv

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.TextView
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * TvAboutActivity
 * Simple TV screen to validate multi-screen navigation and DPAD focus handling.
 * Presents an about message and a button to return to the Index screen.
 */
class TvAboutActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_about)

        val title = findViewById<TextView>(R.id.tvTitle)
        title.isFocusable = false

        val back = findViewById<Button>(R.id.btnBack)
        back.isFocusable = true
        back.isFocusableInTouchMode = true
        back.setOnClickListener { backToIndex() }

        back.requestFocus()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            backToIndex()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun backToIndex() {
        val intent = Intent(this, TvIndexActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }
}
