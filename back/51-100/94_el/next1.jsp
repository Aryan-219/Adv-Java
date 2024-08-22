<%@ page import="models.User" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <hr>
    <h3>Aam zindagi</h3>

    <% User user = (User)request.getAttribute("user"); %>

    <hr>
    User Name: <%= user.getName() %> <br>

    Age: <%= user.getAge() %>
</body>
</html>