<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1><font color="red">Error Page</font></h1>

    <hr>

    <h2><font color="red">Maaf Karna Doston... Abhi hum Pareshan hai...</font></h2>

    <hr>

    <h3><%= exception %></h3>

    <hr>

    <% if(exception instanceof NullPointerException) { %>
        <h4>Some Error caused by Null Value</h4>
    <% } else if(exception instanceof ArithmeticException) { %>
        <h4>Some Error caused by divide by 0</h4>
    <% } %>
</body>
</html>