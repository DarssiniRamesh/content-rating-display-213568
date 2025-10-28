/*
Bridge build.gradle.kts for :app module (actual config is in build.gradle.dcl).
This exists for tools that expect a conventional Gradle file present at the module root.
*/
plugins {
    // No-op; actual plugins and config exist via Declarative Gradle in the workspace
}
tasks.register("assembleDebugBridge") {
    group = "build"
    doLast {
        println("Run from workspace root: ./gradlew :app:assembleDebug")
    }
}
