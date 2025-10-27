TV flags (values-tv/bools.xml)

- is_tv: signals that the current resource qualifier is TV. Useful for conditional code paths if required.
- tv_enable_webview_dpad_paging: feature-flag for paging behavior in TV WebViews.

Access in Kotlin:
  val isTv = resources.getBoolean(R.bool.is_tv)
  val enablePaging = resources.getBoolean(R.bool.tv_enable_webview_dpad_paging)
