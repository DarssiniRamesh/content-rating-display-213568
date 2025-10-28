# Android Discovery Bridge (Repository Root)

Some analyzers start at the repository root and expect a conventional Gradle settings file that declares modules.
Use the provided bridge to map modules to the real Android workspace paths:

- settings.android.include.groovy maps :app, :list, :utilities to:
  content-rating-display-213568/vod_content_rating_frontend/{app|list|utilities}

You can still build via:
- From repo root: ./gradlew :app:assembleDebug
- Or from workspace root:
  cd content-rating-display-213568/vod_content_rating_frontend
  ./gradlew :app:assembleDebug
