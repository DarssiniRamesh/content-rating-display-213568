TV Splash Redirect

- The app now includes TvSplashRedirectActivity as the MAIN/LAUNCHER.
- On Android TV (devices with android.software.leanback), it navigates to TvIndexActivity.
- On non-TV devices, it navigates to MainActivity.
- TV-specific LEANBACK_LAUNCHER intent remains declared on TvIndexActivity so it appears in TV home.
