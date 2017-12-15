var upload = function() {
    init();
    var files = $("#fileSelect")[0].files;
    var num = 0;
    var uploadOne = function() {
        if ( num >= files.length) {
            $("#fileSelect").val("");
            $("#show_message").show();
            $("#show_message").html("操作完毕");
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

var showSelectedNumber = function(){
    $("#show_message").show();
    $("#show_message").append('选择了' + $("#fileSelect")[0].files.length + '个文件准备上传');
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
                titleLink = '<a id=' + result[x].id+ ' href="javascript:void(0);" onclick="showText(this)">' + result[x].dzjTitle + '</a>';
                $("#title_list").append(titleLink);
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

var showText = function(obj){
    clearText()
    $.ajax({
        type: "GET",
        url: "/dzj/showText.do",
        data: {id: obj.id},
        success: function (result) {
            $("#dzj_text").show();
            $("#dzj_text").append(result.replace(/\r?\n/g, '<br>'));
            $("#title_list").append("<br>");
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
    $("#show_message").html("");
}

var select = function() {
    $("#fileSelect").click();
}

var clearMessage = function() {
    $("#show_message").html("");
}

var clearText = function() {
    $("#dzj_text").html("");
}
