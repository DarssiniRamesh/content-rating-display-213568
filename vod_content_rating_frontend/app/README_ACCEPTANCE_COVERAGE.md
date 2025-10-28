# Rating Preview Acceptance Coverage

- Title: bound from RatingInfo.title with null/empty handling
- Rating badge/icon: static row + dynamic badge text (code/label); icon shown in title row
- Advisory text: bound from RatingInfo.advisory with null/empty handling
- Content descriptors: rendered using item_descriptor.xml with EG bullet
- Countdown: Acknowledge disabled until countdown completes when requireCountdown=true
- Acknowledge navigation: Routes to PlaybackActivity placeholder
- Deep link: app://rating/show -> DeepLinkLauncherActivity -> PostPlaybackRatingActivity with seeded RatingInfo
- Executive Gray styling: applied across layouts and Activities
- Strings: missing keys included (rating_title_missing_key, rating_description_missing_key)
