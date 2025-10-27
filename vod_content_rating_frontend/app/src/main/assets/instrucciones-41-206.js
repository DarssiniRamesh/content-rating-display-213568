(function(){
  window.addEventListener('load', function(){
    // Make the button-like yellow container focusable for TV navigation in WebView
    var el = document.getElementById('el-41-226');
    if (el) {
      el.setAttribute('tabindex', '0');
      el.setAttribute('role', 'button');
      el.setAttribute('aria-label', 'Entendido');
    }
  });
})();
