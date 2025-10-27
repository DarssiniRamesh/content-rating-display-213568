package org.example.app.data

// PUBLIC_INTERFACE
data class Content(
    val id: String,
    val title: String?,
    val posterUrl: String?,
    val rollingCreditsTimeSec: Int = 3
)

// PUBLIC_INTERFACE
data class ApaMetadata(
    val invitationCopy: String?
)

// PUBLIC_INTERFACE
data class ApaAssets(
    val iconMap: Map<String, String> = emptyMap()
)

// PUBLIC_INTERFACE
data class LikeResult(val success: Boolean)

// PUBLIC_INTERFACE
interface ContentApi {
    fun getContent(contentId: String): Content
}

// PUBLIC_INTERFACE
interface ApaMetadataApi {
    fun getMetadata(contentId: String): ApaMetadata
}

// PUBLIC_INTERFACE
interface ApaAssetsApi {
    fun getAssets(contentId: String): ApaAssets
}

// PUBLIC_INTERFACE
interface LikesApi {
    fun sendLike(contentId: String, rating: String): LikeResult
}

// PUBLIC_INTERFACE
class InMemoryRatedStore {
    private val rated: MutableSet<String> = mutableSetOf()
    fun isRated(contentId: String): Boolean = rated.contains(contentId)
    fun markRated(contentId: String) { rated.add(contentId) }
}
