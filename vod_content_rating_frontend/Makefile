ANDROID_ROOT=content-rating-display-213568/vod_content_rating_frontend

.PHONY: all build assembleDebug installDebug test clean
all: build

build:
	@cd $(ANDROID_ROOT) && ./gradlew build

assembleDebug:
	@cd $(ANDROID_ROOT) && ./gradlew :app:assembleDebug

installDebug:
	@cd $(ANDROID_ROOT) && ./gradlew :app:installDebug

test:
	@cd $(ANDROID_ROOT) && ./gradlew test

clean:
	@cd $(ANDROID_ROOT) && ./gradlew clean
