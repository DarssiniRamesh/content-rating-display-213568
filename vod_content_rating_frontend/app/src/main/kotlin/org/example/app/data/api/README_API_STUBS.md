# API Client Stubs

Purpose
- Provide lightweight, swappable client interfaces for:
  - /content (ContentClient)
  - /apa/metadata (ApaMetadataClient)
  - /apa/assets (ApaAssetsClient)
  - /likes (LikesClient)

Usage
- DefaultStubClients offers placeholder implementations requiring no external keys.
- To construct a Repository using explicit clients, use RepositoryApiAdapter.fromClients(...).

Example
```kotlin
import org.example.app.data.RepositoryApiAdapter
import org.example.app.data.api.DefaultStubClients

val repo = RepositoryApiAdapter.fromClients(
  contentClient = DefaultStubClients.content,
  metadataClient = DefaultStubClients.metadata,
  assetsClient = DefaultStubClients.assets,
  likesClient = DefaultStubClients.likes
)
```

Notes
- Missing/empty business keys:
  - If missing -> UI shows key name literal (e.g., "content_title")
  - If empty -> UI leaves space but preserves layout sizing
