<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
  <meta content="text/html; charset=UTF8" http-equiv="content-type">
  <title>dzj upload</title>
  <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</head>

<body>

<form id= "uploadForm" enctype="multipart/form-data">
  <input type="file" name="datafile" >
  <input type="button" value="upload" onclick="upload()">
</form>

<div id="success_text"  style="display:none">Success</div>
<div id="fail_text" style="display:none">Failed</div>

<script>
  var upload = function() {
    init();
    var formData = new FormData($("#uploadForm")[0]);
    $.ajax({
      type: "POST",
      url: "/dzj/upload.do",
      data: formData,
      processData: false,
      contentType: false,
      success: function(result){
        $("#success_text").show();
      },
      error: function(){
        $("#fail_text").show();
      }
    });
  }

  var init = function() {
    $("#success_text").hide();
    $("#fail_text").hide();
  }
</script>

</body>

</html>
