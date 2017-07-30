/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $('form > input').keyup(function() {

        var empty1 = false;
        $('form > input').each(function() {
            if ($(this).val() === '') {
             empty1 = true;
                }
        });

        if (empty1) {
            $('#register').attr('disabled', 'disabled');
        } 
        else {
            $('#register').prop("disabled", false);
        }
    });
});

/*$(window).scroll(function(){
    if($("#navbar").scrollTop() === 0 && $("#navbar").css("opacity") !== 1 ){
      $( "#navbar" ).css("opacity", 0.5);
    }else if( $("#navbar").scrollTop() !== 0 && $("#navbar").css("opacity") !== 0.5 ){
      $( "#navbar" ).css("opacity", 1);
    }
}); */

/*$(window).scroll(function() {
   if($(window).scrollTop() + $(window).height() === $(document).height()) {
       $("#navbar").css("opacity", 0);
   }
});
if($('html').offset().top) {
  //If on top
}*/