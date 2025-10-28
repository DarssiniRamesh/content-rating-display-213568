tasks.register("appAssembleDebug") {
    group = "build"
    description = "Alias to build the Android app debug using composite includeBuild"
    dependsOn(gradle.includedBuild("content-rating-display-213568/vod_content_rating_frontend").task(":app:assembleDebug"))
}
