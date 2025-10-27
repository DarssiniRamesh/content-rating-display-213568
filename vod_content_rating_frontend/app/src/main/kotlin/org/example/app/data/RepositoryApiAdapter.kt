package org.example.app.data

import org.example.app.data.api.ApaAssetsClient
import org.example.app.data.api.ApaMetadataClient
import org.example.app.data.api.ContentClient
import org.example.app.data.api.DefaultStubClients
import org.example.app.data.api.LikesClient

/**
 * PUBLIC_INTERFACE
 * RepositoryApiAdapter allows constructing a Repository using explicit API clients.
 * This keeps Repository compatible with existing call sites while enabling swapping
 * of real clients later without touching business logic.
 */
object RepositoryApiAdapter {

    // PUBLIC_INTERFACE
    fun fromClients(
        contentClient: ContentClient = DefaultStubClients.content,
        metadataClient: ApaMetadataClient = DefaultStubClients.metadata,
        assetsClient: ApaAssetsClient = DefaultStubClients.assets,
        likesClient: LikesClient = DefaultStubClients.likes
    ): Repository {
        return Repository(
            contentApi = object : ContentApi {
                override fun getContent(contentId: String): Content = contentClient.fetchContent(contentId)
            },
            metadataApi = object : ApaMetadataApi {
                override fun getMetadata(contentId: String): ApaMetadata = metadataClient.fetchMetadata(contentId)
            },
            assetsApi = object : ApaAssetsApi {
                override fun getAssets(contentId: String): ApaAssets = assetsClient.fetchAssets(contentId)
            },
            likesApi = object : LikesApi {
                override fun sendLike(contentId: String, rating: String): LikeResult =
                    likesClient.postLike(contentId, rating)
            },
            ratedStore = InMemoryRatedStore()
        )
    }
}
