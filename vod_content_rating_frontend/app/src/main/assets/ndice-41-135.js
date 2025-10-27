(function(){
  // Enhance TV DPAD: make main CTA region focusable for WebView DPAD
  window.addEventListener('load', function(){
    var btn = document.getElementById('el-41-146') || document.getElementById('el-41-147');
    if (btn) {
      btn.setAttribute('tabindex', '0');
      btn.setAttribute('role', 'button');
      btn.setAttribute('aria-label', 'Continuar');
      btn.addEventListener('keydown', function(e){
        if (e.key === 'Enter') {
          // no-op: native app handles navigation with native button
        }
      });
    }
  });
})();
