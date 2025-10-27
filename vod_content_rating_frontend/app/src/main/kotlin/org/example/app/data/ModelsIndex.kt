package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * Models is a simple facade exposing the primary data models for analyzers/tools.
 * This complements Models.kt and allows referring to a stable symbol name.
 */
object Models {
    // PUBLIC_INTERFACE
    /**
     * Returns model type class names to facilitate static discovery and reflection tests.
     */
    fun types() = arrayOf(
        Content::class.java.name,
        ApaMetadata::class.java.name,
        ApaAssets::class.java.name,
        LikeResult::class.java.name
    )
}
