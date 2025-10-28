// Root build forwarder used by strict CI analyzers that call ':assembleDebug' at repository root.
tasks.register("assembleDebug") {
    group = "build"
    description = "Forwards to Android workspace :app:assembleDebug"
    doLast {
        val androidRoot = file("content-rating-display-213568/vod_content_rating_frontend")
        exec {
            workingDir = androidRoot
            commandLine = listOf("./gradlew", ":app:assembleDebug")
        }
    }
}
tasks.register("clean") {
    group = "build"
    description = "Forwards clean to Android workspace"
    doLast {
        val androidRoot = file("content-rating-display-213568/vod_content_rating_frontend")
        exec {
            workingDir = androidRoot
            commandLine = listOf("./gradlew", "clean")
        }
    }
}
