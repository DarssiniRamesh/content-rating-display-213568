# App Module

This app module contains the Android Activities and resources for the Content Rating prototypes.

Launcher Activity:
- org.example.app.ui.IndiceActivity

Key Activities:
- InstruccionesActivity
- PlaybackActivity
- PostPlaybackRatingActivity (post-playback rating UI)
- DeepLinkLauncherActivity (app://rating/show)
- AboutActivity
- VcardActivity (placeholder)
- SkipRatingActivity (fallback)

Layouts:
- res/layout/activity_indice.xml
- res/layout/activity_instrucciones.xml
- res/layout/activity_playback.xml
- res/layout/activity_post_playback_rating.xml
- res/layout/activity_vcard.xml

Build using root wrapper:
- cd content-rating-display-213568/vod_content_rating_frontend
- ./gradlew :app:assembleDebug
