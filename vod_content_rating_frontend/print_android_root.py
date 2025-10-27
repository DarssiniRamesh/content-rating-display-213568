#!/usr/bin/env python3
import json, os
root = os.path.join('content-rating-display-213568', 'vod_content_rating_frontend')
modules = [os.path.join(root, m) for m in ('app','list','utilities')]
print(json.dumps({
    "android": {
        "gradle_root": root,
        "modules": modules,
        "instructions": [f"cd {root}", "./gradlew build"]
    }
}, indent=2))
