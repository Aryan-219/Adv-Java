<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1><font color="red">Error 2 Page</font></h1>

    <hr>

    <h2><font color="red">Sorry!!! Some thing went wrong at out side we will fix the problem ... please visit some time lateer ...</font></h2>

    <hr>

    <h3><%= exception %></h3>

    <div style="text-align:center">
        <img src="error.png" height="200">
    </div>    
</body>
</html>