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
});