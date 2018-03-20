/*
    Author : Prakash rai
    Contact : prakashrainpl@gmail.com
    Date : 2018/03/20
    Description : Custom jquery functions for Whats out page
*/

$(document).ready(function(){
    //Show hide when comment clicked in post
    $('.post-feedback-comment').click(function(){
        let postId = $(this).attr('post-id');
        $('#post-comment-' + postId).toggle(200);
    });

    //Changing profile picture
    $(".upload-profile-picture").click(function () {
        $("#profile-picture").trigger('click');
    });

    //change image on leselection
    $("#profile-picture").change(function(){
        let input = this;
        if (input.files) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('.upload-profile-picture')
                    .attr('src', e.target.result);
            };
            reader.readAsDataURL(input.files[0]);
        }
    });

    //Changing Event picture
    $(".upload-event-picture").click(function () {
        $("#event-picture").trigger('click');
    });

    //change image on leselection
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