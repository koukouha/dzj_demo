var upload = function() {
    init();
    var files = $("#fileSelect")[0].files;
    var num = 0;
    var uploadOne = function() {
        if ( num >= files.length) {
            return;
        }
        var data = new FormData();
        data.append('file-' + num, files[num]);
        $.ajax({
            type: "POST",
            url: "/dzj/upload.do",
            data: data,
            processData: false, contentType: false,
            success: function (result) {
                $("#success_text").show();
                $("#success_text").append(result);
                $("#success_text").append("<br>");
                num++;
                uploadOne();
            },
            error: function () {
                $("#fail_text").show();
                $("#fail_text").append("failed");
                $("#fail_text").append("<br>");
                num++;
                uploadOne();
            }
        });
    };
    uploadOne();
}

var showTitle = function(){
    init();
    $.ajax({
        type: "GET",
        url: "/dzj/showTitle.do",
        data:{},
        success: function (result) {
            $("#title_list").show();
            for (x in result) {
                $("#title_list").append(result[x].dzjTitle);
                $("#title_list").append("<br>");
            }
        },
        error: function () {
            $("#title_list").show();
            $("#title_list").append("failed");
            $("#title_list").append("<br>");
        }
    });
}

var init = function() {
    $("#success_text").html("");
    $("#fail_text").html("");
    $("#title_list").html("");
}

var select = function() {
    $("#fileSelect").click();
}