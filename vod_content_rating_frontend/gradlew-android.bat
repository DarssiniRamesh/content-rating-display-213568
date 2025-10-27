@echo off
setlocal
set ROOT=content-rating-display-213568/vod_content_rating_frontend
pushd %ROOT%
call gradlew %*
popd
endlocal
