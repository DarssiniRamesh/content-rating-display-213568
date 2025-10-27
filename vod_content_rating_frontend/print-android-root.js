#!/usr/bin/env node
const path = require('path');
const root = path.join('content-rating-display-213568', 'vod_content_rating_frontend');
const modules = ['app', 'list', 'utilities'].map(m => path.join(root, m));
console.log(JSON.stringify({
  android: {
    gradle_root: root,
    modules,
    instructions: [
      `cd ${root}`,
      './gradlew build'
    ]
  }
}, null, 2));
