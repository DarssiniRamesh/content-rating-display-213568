# App Module Index

Entry Activities:
- org.example.app.ui.IndiceActivity (MAIN/LAUNCHER)
- org.example.app.ui.AliasMainActivity (forwards to Índice)
- org.example.app.ui.PostPlaybackRatingActivity
- org.example.app.ui.PlaybackActivity
- org.example.app.ui.InstruccionesActivity
- org.example.app.ui.DeepLinkLauncherActivity (deep link: app://rating/show)

Rating Preview:
- Uses Parcelable RatingInfo
- Shows rating badge/icon, advisory, descriptors
- Optional countdown before Acknowledge
- Acknowledge navigates to PlaybackActivity
