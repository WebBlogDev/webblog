var B = {};

B.init = function () {
    console.log('Init call');
};

B.login = function () {
    var data = {
        login:$('#inputLogin').val(),
        password:$('#inputPassword').val(),
    };

    $.ajax('/doLogin',{
        method:'POST',
        data:JSON.stringify(data),
        contentType: "application/json",
    });

};

B.register = function () {

};