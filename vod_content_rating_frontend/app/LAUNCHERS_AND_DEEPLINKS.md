# Launchers and Deep Links

Launchers:
- org.example.app.ui.IndiceActivity (MAIN/LAUNCHER)
- org.example.app.ui.AliasMainActivity (alternate launcher that forwards to Índice)

Deep Links:
- app://rating/show → DeepLinkLauncherActivity → PostPlaybackRatingActivity (sample TV-MA rating)
- app://rating/index → ÍndiceActivity

Developer:
- DevLaunchRatingActivity opens PostPlaybackRatingActivity directly with a sample RatingInfo.
