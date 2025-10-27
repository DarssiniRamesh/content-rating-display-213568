(function(){
  // PUBLIC_INTERFACE
  function enableDpadScroll(step) {
    step = step || 120;
    window.addEventListener('keydown', function(e){
      switch (e.key) {
        case 'ArrowDown':
          window.scrollBy(0, step);
          e.preventDefault();
          break;
        case 'ArrowUp':
          window.scrollBy(0, -step);
          e.preventDefault();
          break;
        case 'PageDown':
          window.scrollBy(0, step * 4);
          e.preventDefault();
          break;
        case 'PageUp':
          window.scrollBy(0, -step * 4);
          e.preventDefault();
          break;
      }
    }, {passive:false});
  }
  if (document.readyState === 'complete' || document.readyState === 'interactive') {
    enableDpadScroll();
  } else {
    window.addEventListener('DOMContentLoaded', function(){ enableDpadScroll(); });
  }
})();
