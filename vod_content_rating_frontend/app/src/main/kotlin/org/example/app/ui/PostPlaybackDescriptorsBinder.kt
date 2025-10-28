package org.example.app.ui

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * PostPlaybackDescriptorsBinder
 *
 * Utility to bind descriptor list into the placeholders provided by the rating layout.
 */
object PostPlaybackDescriptorsBinder {
    // PUBLIC_INTERFACE
    fun bind(container: LinearLayout, header: TextView, descriptors: List<String>) {
        container.removeAllViews()
        if (descriptors.isEmpty()) {
            header.visibility = View.GONE
            container.visibility = View.GONE
            return
        }
        header.visibility = View.VISIBLE
        container.visibility = View.VISIBLE
        val ctx = container.context
        descriptors.forEach {
            val tv = TextView(ctx).apply {
                text = "• $it"
                setTextColor(ctx.getColor(R.color.eg_text))
            }
            container.addView(tv)
        }
    }
}
