<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
  <meta content="text/html; charset=UTF8" http-equiv="content-type">
  <title>dzj upload</title>
  <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>

<body>

<form id= "uploadForm" enctype="multipart/form-data">
  <input type="file" id="fileSelect" name="datafile" multiple >
  <input type="button" value="upload" onclick="upload()">
</form>

<div id="success_text"  style="display:none">Success</div>
<div id="fail_text" style="display:none">Fail</div>

<script>
  var upload = function() {

    init();
//    var formData = new FormData($("#uploadForm")[0]);
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

  var init = function() {
    $("#success_text").html("");
    $("#success_text").append("<br>");
    $("#fail_text").html("");
    $("#fail_text").append("<br>");
  }
</script>

</body>

</html>
