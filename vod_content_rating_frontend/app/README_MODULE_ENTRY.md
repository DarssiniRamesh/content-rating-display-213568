# App Module Entry

- Namespace: org.example.app
- Launcher: org.example.app.ui.AliasMainActivity (forwards to ÍndiceActivity)
- Deep link: app://rating/show (DeepLinkLauncherActivity)
- Rating screen: PostPlaybackRatingActivity (uses Parcelable RatingInfo)

Build the workspace:
- cd ../../
- ./gradlew :app:assembleDebug
