# E2E: Post-Playback Rating (PIP-style)

Flow
- ÍndiceActivity (launcher) -> InstruccionesActivity (ack) -> PlaybackActivity (auto-simulates credits) -> PostPlaybackRatingActivity
- Deep links: app://rating/postplay (via PostPlaybackRatingActivity intent-filter)
- QA shortcuts:
  - Índice overflow menu: Start playback (QA)
  - Índice button: “Open Content Rating” starts Playback which auto-triggers rating

Business rules
- Skip if already rated (in-memory store)
- Don’t show if playback closed before rollingCreditsTime
- Auto-close after display_time (1..60s)
- If closed and user rewinds before credits, show again (caller relaunch)
- Missing/empty keys: show key name if missing; leave space if empty; preserve layout sizing
- Default D-pad focus on Close

APIs (stubs)
- /content -> ContentClient
- /apa/metadata -> ApaMetadataClient
- /apa/assets -> ApaAssetsClient
- /likes -> LikesClient
- Use RepositoryApiAdapter to swap clients

Build
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug

Files to explore
- ui/PostPlaybackRatingActivity.kt
- res/layout/activity_post_playback_rating.xml
- data/Repository.kt, data/Models.kt, data/Defaults.kt
- data/api/ApiClients.kt, data/RepositoryApiAdapter.kt
- ui/PlaybackActivity.kt, ui/IndiceActivity.kt
