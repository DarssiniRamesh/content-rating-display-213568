.PHONY: android build clean

ANDROID_ROOT=content-rating-display-213568/vod_content_rating_frontend

android:
	@echo "Android workspace: $(ANDROID_ROOT)"
	@echo "Wrapper: $(ANDROID_ROOT)/gradlew"
	@echo "Settings: $(ANDROID_ROOT)/settings.gradle.dcl"
	cd $(ANDROID_ROOT) && ./gradlew :app:assembleDebug

build: android

clean:
	cd $(ANDROID_ROOT) && ./gradlew clean
