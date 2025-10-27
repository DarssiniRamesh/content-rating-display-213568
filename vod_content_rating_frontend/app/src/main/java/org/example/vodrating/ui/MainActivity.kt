package org.example.vodrating.ui

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import org.example.vodrating.R

/**
 * PUBLIC_INTERFACE
 * MainActivity
 *
 * This activity shows a simple content rating screen for VOD content where the user
 * can view the rating and acknowledge before proceeding.
 */
class MainActivity : AppCompatActivity() {

    // PUBLIC_INTERFACE
    override fun onCreate(savedInstanceState: Bundle?) {
        /** Initialize the content rating screen with Executive Gray theming. */
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.title)
        val rating = findViewById<TextView>(R.id.ratingBadge)
        val desc = findViewById<TextView>(R.id.description)
        val acknowledge = findViewById<Button>(R.id.acknowledgeBtn)
        val icon = findViewById<ImageView>(R.id.iconShield)

        title.text = getString(R.string.vod_title_placeholder)
        rating.text = getString(R.string.rating_label_pg13)
        desc.text = getString(R.string.rating_description_pg13)
        icon.contentDescription = getString(R.string.content_rating_icon)

        // Subtle emphasized style per Executive Gray theme
        title.setTypeface(null, Typeface.BOLD)
        rating.setTypeface(null, Typeface.BOLD)

        acknowledge.setOnClickListener {
            // For demo, simply show a confirmation state
            acknowledge.text = getString(R.string.acknowledged)
            acknowledge.isEnabled = false
            (findViewById<View>(R.id.acknowledgedNote)).visibility = View.VISIBLE
        }
    }
}
