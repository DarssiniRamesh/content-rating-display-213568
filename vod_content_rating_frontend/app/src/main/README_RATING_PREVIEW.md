# Rating Preview

Entry points:
- Launcher: ÍndiceActivity (tap title -> Instrucciones; QA button -> opens rating directly)
- Deep link: app://rating/show (handled by DeepLinkLauncherActivity)
- Developer: RatingPreviewEntryActivity (secondary launcher, not visible by default)

What you should see:
- Title, rating badge (code/label), advisory text, optional descriptors (e.g., Violence, Language)
- Countdown (3s in seeded examples) disabling the Acknowledge button until completion
- Executive Gray styling across the layout

Navigation:
- Acknowledge navigates to PlaybackActivity placeholder and finishes the rating screen.
