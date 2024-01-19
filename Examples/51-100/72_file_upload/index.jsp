<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>File Upload Demo...</h1>

    <hr>

    <form action="upload_pic.do" method="post" enctype="multipart/form-data">
        <!-- First Pic: <input type="file" name="my_pics"> <br><br>
        Second Pic: <input type="file" name="my_pics"> <br><br>
        Third Pic: <input type="file" name="my_pics"> <br><br> -->

        Upload Multiple Pics: <input type="file" name="my_pic" multiple accept="image/jpeg,image/gif"> <br><br>

        <input type="submit" value="Upload">
    </form>
</body>
</html>