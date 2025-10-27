package org.example.app.data.api

import org.example.app.data.ApaAssets
import org.example.app.data.ApaMetadata
import org.example.app.data.Content
import org.example.app.data.LikeResult

// PUBLIC_INTERFACE
interface ContentClient {
    /** Simulates GET /content?id={contentId} */
    fun fetchContent(contentId: String): Content
}

// PUBLIC_INTERFACE
interface ApaMetadataClient {
    /** Simulates GET /apa/metadata?content={contentId} */
    fun fetchMetadata(contentId: String): ApaMetadata
}

// PUBLIC_INTERFACE
interface ApaAssetsClient {
    /** Simulates GET /apa/assets?content={contentId} */
    fun fetchAssets(contentId: String): ApaAssets
}

// PUBLIC_INTERFACE
interface LikesClient {
    /** Simulates POST /likes body: { contentId, rating } */
    fun postLike(contentId: String, rating: String): LikeResult
}

/**
 * Default stubbed implementations that do not require external keys.
 * These are separated from Repository’s prior internal stubs to make
 * the client API explicit and swappable.
 */
// PUBLIC_INTERFACE
object DefaultStubClients {
    val content: ContentClient = object : ContentClient {
        override fun fetchContent(contentId: String): Content {
            return when {
                contentId.endsWith("missing") -> Content(contentId, null, null, 3)
                contentId.endsWith("empty") -> Content(contentId, "", null, 3)
                else -> Content(contentId, "Sample Movie Title", null, 3)
            }
        }
    }

    val metadata: ApaMetadataClient = object : ApaMetadataClient {
        override fun fetchMetadata(contentId: String): ApaMetadata {
            return when {
                contentId.contains("missing_meta") -> ApaMetadata(null)
                contentId.contains("empty_meta") -> ApaMetadata("")
                else -> ApaMetadata("How did you like this video?")
            }
        }
    }

    val assets: ApaAssetsClient = object : ApaAssetsClient {
        override fun fetchAssets(contentId: String): ApaAssets =
            ApaAssets(
                iconMap = mapOf(
                    "like" to "ic_like_placeholder",
                    "love" to "ic_love_placeholder",
                    "dislike" to "ic_dislike_placeholder",
                    "close" to "ic_close_placeholder"
                )
            )
    }

    val likes: LikesClient = object : LikesClient {
        override fun postLike(contentId: String, rating: String): LikeResult {
            return LikeResult(rating in setOf("like", "love", "dislike"))
        }
    }
}
