$(document).ready(function() {
    $("#MyButton").click(function () {
        let selectedOption = $('#locales').val();
        if (selectedOption !== ''){
            window.location.replace('international?lang=' + selectedOption);
        }
    });
});

    $(document).ready(function(){
    $('#MyButton').click(function(){
    });
});
