Android TV metadata notes

- Leanback launcher category is declared for TvIndexActivity in AndroidManifest.xml:
  <category android:name="android.intent.category.LEANBACK_LAUNCHER" />

- TV banner resource:
  res/drawable-nodpi/banner_tv.xml
  Referenced by TvIndexActivity as android:banner.

- TV-specific strings:
  res/values-tv/strings-tv-launcher.xml
  res/values-tv/strings-leanback.xml
  res/values-tv/strings-app-meta.xml
  res/values-tv/strings-launcher-labels.xml

- Theme:
  res/values-tv/themes.xml (Theme.VodCalificador.TV)
