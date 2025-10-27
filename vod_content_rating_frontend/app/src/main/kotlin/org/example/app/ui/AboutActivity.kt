package org.example.app.ui

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * AboutActivity shows brief information about the app and workspace paths to aid QA.
 */
class AboutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = getString(R.string.app_name) +
                "\nWorkspace: content-rating-display-213568/vod_content_rating_frontend" +
                "\nBuild: ./gradlew :app:assembleDebug"
            textSize = 16f
        }
        setContentView(tv)
    }
}
