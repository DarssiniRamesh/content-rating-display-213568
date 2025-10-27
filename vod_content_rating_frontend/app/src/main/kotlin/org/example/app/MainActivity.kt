package org.example.app

import org.apache.commons.text.WordUtils

import org.example.list.LinkedList
import org.example.utilities.SplitUtils
import org.example.utilities.StringUtils

import android.widget.TextView
import android.os.Bundle
import android.app.Activity
import android.view.Menu
import android.view.MenuItem
import android.content.Intent

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView) as TextView
        textView.text = buildMessage()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_open_tv_index -> {
                startActivity(Intent(this, org.example.app.tv.TvIndexActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun buildMessage(): String {
        val tokens: LinkedList
        tokens = SplitUtils.split(MessageUtils.message())
        val result: String = StringUtils.join(tokens)
        return WordUtils.capitalize(result)
    }
}
