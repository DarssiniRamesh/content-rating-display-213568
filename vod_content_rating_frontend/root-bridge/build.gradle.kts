tasks.register("helpRootBridge") {
    group = "help"
    description = "Root bridge module that exists for repository root project structure."
    doLast {
        println("This is a no-op module. The Android app lives under content-rating-display-213568/vod_content_rating_frontend.")
    }
}
