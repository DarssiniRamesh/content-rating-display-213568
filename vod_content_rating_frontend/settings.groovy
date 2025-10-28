rootProject.name = "android-root-direct-include-groovy"

include(":app")
project(":app").projectDir = file("content-rating-display-213568/vod_content_rating_frontend/app")

include(":list")
project(":list").projectDir = file("content-rating-display-213568/vod_content_rating_frontend/list")

include(":utilities")
project(":utilities").projectDir = file("content-rating-display-213568/vod_content_rating_frontend/utilities")
