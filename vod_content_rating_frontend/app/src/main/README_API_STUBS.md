# API Stubs Overview

This app ships with lightweight, in-memory API stubs so it runs without external keys:
- ContentApi (/content) -> StubContentApi
- ApaMetadataApi (/apa/metadata) -> StubApaMetadataApi
- ApaAssetsApi (/apa/assets) -> StubApaAssetsApi
- LikesApi (/likes) -> StubLikesApi

Repository: org.example.app.data.Repository
- Centralizes fetching and rating calls.
- Tracks per-session rated content to apply business rules (`hasUserRated`).

Business rules applied in PostPlaybackRatingActivity:
- Skip if missing contentId or already rated.
- Skip if playback position < rollingCreditsTime.
- Auto-close after display_time (capped to 60s).
- If user rewinds before rolling credits, caller can re-launch this screen.

Testing missing/empty keys:
- Use contentId suffixes:
  - "...missing" -> title null, invite null -> shows key names per spec.
  - "...empty" -> title "", invite "" -> leaves visual space but preserves layout sizing.

Intent extras (org.example.app.data.IntentKeys):
- EXTRA_CONTENT_ID (String)
- EXTRA_DISPLAY_TIME_SEC (Int, default 10, max 60)
- EXTRA_PLAYBACK_POSITION_SEC (Int)
- EXTRA_ROLLING_CREDITS_SEC (Int, default 3)

Navigation:
- Índice -> Instrucciones -> Playback -> Post-Playback Rating -> Playback (or Vcard placeholder).
