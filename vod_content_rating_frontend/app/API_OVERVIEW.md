# Post-Playback Rating API Overview

Overview
- The app implements a Post-Playback Rating screen with a PIP-style UI.
- Business rules:
  - Skip if already rated during the session.
  - Do not show if playback closed before rolling credits time.
  - Auto-close after `display_time` (default 10s; max 60s).
  - If closed and user rewinds before rolling credits, show when credits reached again.
  - Missing keys: show key name; Empty keys: reserve space to preserve layout.

Public Interfaces (Kotlin)
- org.example.app.data.Repository
- org.example.app.data.ContentApi, ApaMetadataApi, ApaAssetsApi, LikesApi
- org.example.app.data.RatedStore (Session implementation)
- org.example.app.data.RatingActions
- org.example.app.data.Constants

Screens
- org.example.app.ui.IndiceActivity (Launcher)
- org.example.app.ui.InstruccionesActivity
- org.example.app.ui.PlaybackActivity (simulates reaching credits and launches PostPlaybackRatingActivity)
- org.example.app.ui.PostPlaybackRatingActivity
- org.example.app.ui.VcardActivity (placeholder)

Navigation Flow
- Índice -> Instrucciones -> Playback -> PostPlaybackRating
- QA menus available to reset session or jump directly for testing.
