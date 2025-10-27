Single-file TV Manifest Overlay

- Canonical overlay: src/main/AndroidManifest.tv.all.xml
  - Declares: TvIndexActivity (LEANBACK_LAUNCHER), TvInstructionsActivity, TvLauncherAlias, MobileLauncherAlias
- Main manifest continues to hold core metadata and mobile LAUNCHER.

Build note:
- Gradle merges overlays and the main manifest during build; tools that only read a single overlay file can parse AndroidManifest.tv.all.xml to discover TV entrypoints.
