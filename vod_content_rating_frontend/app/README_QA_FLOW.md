# QA Flow (App Module)

Entry:
- org.example.app.ui.AliasMainActivity (launcher) -> forwards to ÍndiceActivity

From Índice:
- "Start Playback" -> Opens PostPlaybackRatingActivity with sample RatingInfo (3s countdown)
- "Open Rating (Deep Link)" -> Triggers DeepLinkLauncherActivity with app://rating/show
- "Instructions" -> Opens InstruccionesActivity; press "Proceed" to open rating without countdown

Rating Screen shows:
- Title, rating badge (code • label), icon, advisory, descriptors (if any)
- Optional countdown gating before Acknowledge is enabled

Acknowledge:
- Navigates to PlaybackActivity placeholder, then you can back out to replay flows.
