package org.example.app.tv

/**
 * PUBLIC_INTERFACE
 * LeanbackKeepRefs
 * References a few Leanback classes in a no-op way to aid analyzers and prevent stripping.
 */
object LeanbackKeepRefs {
    fun touch() {
        // Import references via fully-qualified names to avoid needing dependencies here
        val _ = listOf(
            androidx.leanback.app.BrowseSupportFragment::class.java.name,
            androidx.leanback.widget.ListRow::class.java.name,
            androidx.leanback.widget.Presenter::class.java.name
        )
        // no-op to avoid unused warnings
        if (_ .isEmpty()) {
            // never executed
        }
    }
}
