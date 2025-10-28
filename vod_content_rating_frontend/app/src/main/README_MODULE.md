# App Module (src/main)

This is the primary Android application source set.

Key files:
- AndroidManifest.xml
- res/ (layouts, values, drawables)
- kotlin/ (Activities under org.example.app.ui, data models under org.example.app.data)

Entry screens:
- org.example.app.ui.AliasMainActivity (launcher) ➜ forwards to ÍndiceActivity
- org.example.app.ui.IndiceActivity ➜ InstruccionesActivity ➜ PostPlaybackRatingActivity

Deep link:
- app://rating/show (handled by DeepLinkLauncherActivity) opens PostPlaybackRatingActivity with a sample RatingInfo
