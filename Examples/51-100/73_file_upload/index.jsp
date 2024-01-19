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
        User Name: <input type="text" name="unm"> <br><br>

        Email: <input type="email" name="eml"> <br><br>
        
        Password: <input type="password" name="pwd"> <br><br>

        Phone: <input type="number" name="phone"> <br><br>
        
        My Pic: <input type="file" name="my_pic"> <br><br>

        <input type="submit" value="Upload">
    </form>
</body>
</html>