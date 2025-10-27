Android TV module notes

- TV launcher Activity: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- Secondary Activity: org.example.app.tv.TvInstructionsActivity
- Layouts: res/layout-tv/activity_tv_index.xml, activity_tv_instructions.xml
- TV resources: res/values-tv/strings.xml, styles.xml, dimens.xml
- Focus: Buttons use @drawable/focus_ring with visible focus state; initial focus requested in Activities.
- Assets: HTML/CSS/JS and images are under app/src/main/assets and loaded with file:///android_asset/ URLs.
- Build: Run from project root with ./gradlew (forwards) or cd into content-rating-display-213568/vod_content_rating_frontend and run ./gradlew build.
