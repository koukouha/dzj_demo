<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
  <meta content="text/html; charset=UTF8" http-equiv="content-type">
  <title>dzj upload</title>
  <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
  <link href="css/fileUpload.css" rel="stylesheet" type="text/css">
</head>

<body>

  <input type="file" id="fileSelect" name="datafile" style="display:none" multiple >
  <div id="fileUploadContent" class="fileUploadContent">
    <div class="uploadBts">
      <div>
        <div class="selectFileBt" onclick="select()">选择文件</div>
      </div>
      <div>
        <div class="selectFileBt" onclick="upload()">上传文件</div>
      </div>
      <div>
        <div class="selectFileBt" onclick="showTitle()">显示目录</div>
      </div>
    </div>

    <div class="subberProgress">
      <div class="progress">
        <div>0%</div>
      </div>
    </div>

    <div class="box-left">
      <div id="success_text" style="display:none"></div>
      <div id="fail_text" style="display:none"></div>
      <div id="title_list" style="display:none"></div>
    </div>

    <div class="box-right">
      <div id="dzj_text" style="display:none"></div>
    </div>
  </div>

<script type="text/javascript" src="js/upload.js"></script>

</body>

</html>
