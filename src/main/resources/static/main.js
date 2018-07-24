requirejs.config({
    paths: {
        "jquery": "jquery-2.1.4",
        "handlebars":"handlebars",
        "index":"index"
    }
})


require(["jquery","handlebars","index"], function($,handlebars) {


    var template = handlebars.compile($("#data-template").html());

    $(function () {
        init();
    })
    function init() {
        console.log( template);
        $.ajax({
            type:"get",
            url: "/list",
            dataType:"json",
            success:function (data) {
                console.log(data);
                $("#data").html(template(data));
            }
        })
    }

});


