TV build and run quick start

- Project root: this directory (contains settings.gradle and build.gradle)
- Build (debug): ./gradlew :app:assembleDebug
- Install (if device/emulator connected): ./gradlew :app:installDebug
- TV launcher Activity: org.example.app.tv.TvIndexActivity (LEANBACK_LAUNCHER)
- Mobile launcher Activity: org.example.app.MainActivity

Assets:
- HTML/CSS/JS in app/src/main/assets/
- WebView URLs use file:///android_asset/

Layouts:
- TV-specific in app/src/main/res/layout-tv/
