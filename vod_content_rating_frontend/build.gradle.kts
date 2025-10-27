// Root Gradle build script (bridge). Actual Android configuration lives under
// content-rating-display-213568/vod_content_rating_frontend using Declarative Gradle (.dcl).
// This file intentionally does not declare plugins; it exists to mark the root as a Gradle project.

tasks.register("helpAndroidBridge") {
    group = "help"
    description = "Shows how to build the Android app from this repository root."
    doLast {
        println("Run: ./gradlew :appRoot:assembleDebug (bridge) or cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug")
    }
}

tasks.register("androidAssemble") {
    group = "build"
    description = "Delegates to Android workspace assemble task."
    doLast {
        println("Delegating: cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug")
    }
}
