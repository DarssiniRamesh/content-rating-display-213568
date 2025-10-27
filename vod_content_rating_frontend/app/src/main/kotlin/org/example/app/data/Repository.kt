package org.example.app.data

/**
 * PUBLIC_INTERFACE
 * Repository returning placeholder objects so the app can run without network/keys.
 */
class Repository(
    private val contentApi: ContentApi = StubContentApi(),
    private val metadataApi: ApaMetadataApi = StubApaMetadataApi(),
    private val assetsApi: ApaAssetsApi = StubApaAssetsApi(),
    private val likesApi: LikesApi = StubLikesApi(),
    private val ratedStore: InMemoryRatedStore = InMemoryRatedStore()
) {

    // PUBLIC_INTERFACE
    fun getContent(contentId: String): Content = contentApi.getContent(contentId)

    // PUBLIC_INTERFACE
    fun getMetadata(contentId: String): ApaMetadata = metadataApi.getMetadata(contentId)

    // PUBLIC_INTERFACE
    fun getAssets(contentId: String): ApaAssets = assetsApi.getAssets(contentId)

    // PUBLIC_INTERFACE
    fun hasUserRated(contentId: String): Boolean = ratedStore.isRated(contentId)

    // PUBLIC_INTERFACE
    fun sendRating(contentId: String, rating: String): Boolean {
        val result = likesApi.sendLike(contentId, rating)
        if (result.success) ratedStore.markRated(contentId)
        return result.success
    }
}

// ----- Stub implementations -----
private class StubContentApi : ContentApi {
    override fun getContent(contentId: String): Content {
        return when {
            contentId.endsWith("missing") -> Content(contentId, null, null, 3)
            contentId.endsWith("empty") -> Content(contentId, "", null, 3)
            else -> Content(contentId, "Sample Movie Title", null, 3)
        }
    }
}

private class StubApaMetadataApi : ApaMetadataApi {
    override fun getMetadata(contentId: String): ApaMetadata {
        return when {
            contentId.contains("missing_meta") -> ApaMetadata(null)
            contentId.contains("empty_meta") -> ApaMetadata("")
            else -> ApaMetadata("How did you like this video?")
        }
    }
}

private class StubApaAssetsApi : ApaAssetsApi {
    override fun getAssets(contentId: String): ApaAssets = ApaAssets(
        iconMap = mapOf(
            "like" to "ic_like_placeholder",
            "love" to "ic_love_placeholder",
            "dislike" to "ic_dislike_placeholder",
            "close" to "ic_close_placeholder"
        )
    )
}

private class StubLikesApi : LikesApi {
    override fun sendLike(contentId: String, rating: String): LikeResult {
        return LikeResult(rating in setOf("like", "love", "dislike"))
    }
}
