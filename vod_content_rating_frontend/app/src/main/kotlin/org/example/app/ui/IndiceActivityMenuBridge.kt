package org.example.app.ui

import android.app.Activity
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * ÍndiceActivityMenuBridge provides optional menu wiring to start PlaybackActivity directly.
 * Call attachTo to delegate onCreateOptionsMenu/onOptionsItemSelected if needed by QA.
 */
object IndiceActivityMenuBridge {

    // PUBLIC_INTERFACE
    fun onCreateOptionsMenu(activity: Activity, menu: Menu): Boolean {
        activity.menuInflater.inflate(R.menu.menu_indice_playback, menu)
        return true
    }

    // PUBLIC_INTERFACE
    fun onOptionsItemSelected(activity: Activity, item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_indice_start_playback_direct -> {
                activity.startActivity(Intent(activity, PlaybackActivity::class.java).apply {
                    putExtra(PlaybackActivity.EXTRA_CONTENT_ID, "prototype_1")
                })
                true
            }
            else -> false
        }
    }
}
