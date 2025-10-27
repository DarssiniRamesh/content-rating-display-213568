package org.example.app

import org.example.app.data.Repository
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RepositoryStubTest {
    @Test
    fun `stub likes accept valid ratings`() {
        val repo = Repository()
        assertTrue(repo.sendRating("content_1", "like"))
        assertTrue(repo.sendRating("content_1", "love"))
        assertTrue(repo.sendRating("content_1", "dislike"))
    }
}
