# Build Notes - :utilities module

This is an Android library module built as part of the Declarative Gradle project.

How to build (from Android project root):
- ./gradlew :utilities:assemble

Notes:
- The module is included in settings.gradle.dcl (`include("utilities")`).
- It depends on the `:list` module and is used by the `:app` module.
