# Android TV Entry Notes

- Android app module lives under `app/`.
- Launch entry for TV is `org.example.app.TvSplashRedirectActivity` (MAIN/LAUNCHER), which routes to `org.example.app.tv.TvIndexActivity` on TV devices.
- TV layouts are under `app/src/main/res/layout-tv/`.
- Web assets are under `app/src/main/assets/`.

Build:
- From this folder, run: `../gradlew :app:assembleDebug` or open in Android Studio.
