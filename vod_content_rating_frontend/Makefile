.PHONY: all android clean

ANDROID_ROOT=content-rating-display-213568/vod_content_rating_frontend

all: android

android:
	@echo "Building Android app via $(ANDROID_ROOT)/gradlew ..."
	cd $(ANDROID_ROOT) && ./gradlew :app:assembleDebug

clean:
	@echo "Cleaning Android workspace ..."
	cd $(ANDROID_ROOT) && ./gradlew clean
