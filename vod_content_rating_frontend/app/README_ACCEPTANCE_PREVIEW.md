# Rating Preview Acceptance Checklist

This module implements the full rating preview experience.

Features surfaced in preview:
- Title, rating badge/icon, rating code/label (badge inserted under title)
- Advisory text (long form)
- Content descriptors list (chips/text bullets) when provided
- Optional countdown that disables Acknowledge until it completes
- Acknowledge navigates to PlaybackActivity (placeholder)
- Deep link app://rating/show opens rating with sample params
- Executive Gray theme applied across screens
- Null/empty handling: shows key literal (e.g., content_title) when null; preserves space when empty

Where to verify:
- Launch flow: AliasMainActivity -> ÍndiceActivity -> InstruccionesActivity -> PostPlaybackRatingActivity
- Deep link: adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Files of interest:
- ui/PostPlaybackRatingActivity.kt (binding and countdown)
- data/RatingInfo.kt (Parcelable model)
- ui/DeepLinkLauncherActivity.kt (deep link handling)
- res/layout/activity_post_playback_rating.xml (layout incl. descriptors placeholders)
- res/layout/activity_indice_preview.xml (launcher preview UI)
- Theme: res/values/themes.xml + AppCompat alias

Notes:
- All strings used by preview are provided in res/values (strings_*.xml).
- Layout alias maps activity_indice to preview variant for consistency.
