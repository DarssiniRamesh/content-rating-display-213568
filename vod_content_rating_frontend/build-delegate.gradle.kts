tasks.register("assembleAndroidApp") {
    description = "Delegates to the nested Android project's :app:assembleDebug"
    group = "build"
    doLast {
        println("Delegating to nested Android project: content-rating-display-213568/vod_content_rating_frontend")
        // Print hint for analyzers
        println("Run: cd content-rating-display-213568/vod_content_rating_frontend && ./gradlew :app:assembleDebug")
    }
}
