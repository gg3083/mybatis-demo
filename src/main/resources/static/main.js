requirejs.config({
    paths: {
        "jquery": "jquery-2.1.4",
        "handlebars":"handlebars",
        "index":"index"
    }
})


require(["jquery","handlebars","index"], function($,handlebars) {


    var template = handlebars.compile($("#data-template").html());

    handlebars.registerHelper('formatnumber', function(num, options){
        num = num + '';
        return num.replace(/(?=(?!^)(?:\d{3})+(?:\.|$))(\d{3}(\.\d+$)?)/g,',$1');
    });
    handlebars.registerHelper('formattext', function(text, options){
        return text.substring(0, 3)+'...';
    });

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


