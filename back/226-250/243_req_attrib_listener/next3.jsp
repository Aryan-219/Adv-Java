<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Three Page</h1>

    <hr>

    <a href="next4.jsp">Next Four Page</a> <br><br>

    
    <% request.setAttribute("bbb", 555); %>
    <% request.removeAttribute("bbb"); %>
</body>
</html>