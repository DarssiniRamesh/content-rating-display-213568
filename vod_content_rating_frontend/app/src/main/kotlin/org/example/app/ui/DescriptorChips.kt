package org.example.app.ui

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setPadding
import org.example.app.R

/**
 * PUBLIC_INTERFACE
 * DescriptorChips renders a list of content descriptors as small chips in a LinearLayout container.
 */
object DescriptorChips {

    // PUBLIC_INTERFACE
    fun render(context: Context, container: LinearLayout, descriptors: List<String>) {
        container.removeAllViews()
        if (descriptors.isEmpty()) {
            container.visibility = ViewGroup.GONE
            return
        }
        container.visibility = ViewGroup.VISIBLE
        descriptors.forEach { label ->
            val chip = TextView(context).apply {
                text = label
                setPadding(context.resources.getDimensionPixelSize(R.dimen.eg_space_sm))
                setTextColor(context.getColor(R.color.eg_text))
                setBackgroundColor(context.getColor(R.color.eg_surface))
            }
            val lp = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                rightMargin = context.resources.getDimensionPixelSize(R.dimen.eg_space_sm)
                bottomMargin = context.resources.getDimensionPixelSize(R.dimen.eg_space_xs)
            }
            container.addView(chip, lp)
        }
    }
}
