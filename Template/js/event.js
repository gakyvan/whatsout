/*
    Author : Prakash rai
    Contact : prakashrainpl@gmail.com
    Date : 2018/03/20
    Description : Custom jquery functions for events page
*/

$(document).ready(function(){
    $(".upload-event-picture").click(function () {
        $("#event-picture").trigger('click');
    });

    //change image on selection
    $("#event-picture").change(function(){
        let input = this;
        if (input.files) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('.upload-event-picture')
                    .attr('src', e.target.result);
            };
            reader.readAsDataURL(input.files[0]);
        }
    });
});