/**
 * Sets the active navigation tab
 */
$(function() {
   $(".nav").find(".active").removeClass("active");
   $('a[href="' + this.location.pathname + '"]').parents('li,ul').addClass('active');
});
