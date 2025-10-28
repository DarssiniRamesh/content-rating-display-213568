# Descriptors Rendering

- The rating screen shows a list of content descriptors (e.g., Violence, Language).
- PostPlaybackRatingActivity populates descriptors under `descriptorsContainer` with TextViews.
- A reusable row layout `item_descriptor.xml` is provided with a bullet and Executive Gray styling if inflating rows is preferred.
- To switch to layout inflation, replace the TextView creation in PostPlaybackRatingActivity with:
  `layoutInflater.inflate(R.layout.item_descriptor, descriptorsContainer, false)` and set the `descriptorText` value.
