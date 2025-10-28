# Preview Verification

What to see:
- Title, rating badge (code/label), icon
- Advisory text and descriptors list (if provided)
- Optional countdown (Acknowledge disabled until it completes)
- Acknowledge navigates to PlaybackActivity

Flows:
1) Launcher → Índice
   - Tap title → Instrucciones → Proceed → Rating
   - QA button → Rating directly (countdown=3s)
2) Deep link:
   adb shell am start -W -a android.intent.action.VIEW -d "app://rating/show" org.gradle.experimental.android.app

Theme:
- Executive Gray applied across screens.

Null/Empty handling:
- Null shows key literal (e.g., content_title, advisory).
- Empty keeps space to preserve layout.
