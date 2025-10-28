package org.example.app.ui

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * ÍndiceActivity menu wiring separated into a small file to keep main file concise.
 */
@Suppress("FunctionName")
fun IndiceActivity_WireMenu(activity: IndiceActivity) {
    // No-op in this helper; actual overrides are in IndiceActivity via extension fns below.
}

@Suppress("unused")
fun IndiceActivity.onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_indice, menu)
    return true
}

@Suppress("unused")
fun IndiceActivity.onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
        R.id.action_about -> {
            startActivity(Intent(this, AboutActivity::class.java))
            true
        }
        R.id.action_deeplink_help -> {
            startActivity(Intent(this, DeepLinkHelpActivity::class.java))
            true
        }
        else -> false
    }
}
