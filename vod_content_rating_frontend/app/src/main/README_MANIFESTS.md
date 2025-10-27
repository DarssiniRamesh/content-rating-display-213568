# Android App Manifests and Overlays

Primary manifest:
- app/src/main/AndroidManifest.xml

Overlays / additions:
- AndroidManifest.additions.xml: Adds INTERNET permission for clarity in merges.
- AndroidManifest.tvtheme.xml: Applies the TV theme to TvIndexActivity and TvInstructionsActivity.
- AndroidManifest.alias.xml: Declares a TV activity alias with LEANBACK_LAUNCHER (optional helper for analyzers).

Notes:
- TV activities (TvIndexActivity, TvInstructionsActivity) set labels, banner, configChanges, and Leanback launcher category.
- If you update TV banners, edit `@mipmap/banner_tv` (preferred) or `@drawable/banner_tv`.
- Keep WebView cleartext enabled only for local assets; see res/xml/network_security_config.xml.
