# Android Workspace Entry

Workspace root:
- content-rating-display-213568/vod_content_rating_frontend

Settings:
- settings.gradle.dcl (primary, Gradle 9 Declarative)
- settings.gradle (bridge)

Modules:
- :app -> app/
- :list -> list/
- :utilities -> utilities/

Wrapper:
- ./gradlew

Launcher Activity:
- org.example.app.ui.AliasMainActivity

Build:
- ./gradlew :app:assembleDebug

Alternate (from repository root):
- ./gradlew :app:assembleDebug (root bootstrap delegates to this workspace)
