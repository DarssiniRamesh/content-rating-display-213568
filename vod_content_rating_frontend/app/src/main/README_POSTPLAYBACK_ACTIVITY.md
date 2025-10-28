# PostPlaybackRatingActivity (Preview)

Extras:
- IntentKeys.EXTRA_RATING_INFO (Parcelable RatingInfo)

Model:
- RatingInfo(title, ratingCode, ratingLabel, advisory, descriptors, requireCountdown, countdownSeconds)

UI:
- Title, badge (code/label), advisory text, optional descriptors, countdown (if required), actions, Acknowledge button.

Navigation:
- Acknowledge returns to PlaybackActivity placeholder.

Deep link:
- app://rating/show -> DeepLinkLauncherActivity -> PostPlaybackRatingActivity
