<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>File Upload Demo</h1>

    <hr>

    <form action="upload.do" method="post" enctype="multipart/form-data">
        Choose File: <input type="file" name="my_pic"> <br><br>

        <input type="submit" value="Upload">
    </form>
</body>
</html>