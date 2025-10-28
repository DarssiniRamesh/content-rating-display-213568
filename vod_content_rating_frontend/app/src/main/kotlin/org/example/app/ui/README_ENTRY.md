# Entry UI Overview

- AliasMainActivity (launcher) immediately forwards to ÍndiceActivity.
- ÍndiceActivity uses activity_indice (aliased to activity_indice_preview) and provides:
  - Tap title -> InstruccionesActivity
  - QA button -> directly opens PostPlaybackRatingActivity with a RatingInfo model
- InstruccionesActivity shows a Proceed button that launches PostPlaybackRatingActivity with a different seeded RatingInfo.

This guarantees a discoverable and functional navigation path into the rating preview flow. 
