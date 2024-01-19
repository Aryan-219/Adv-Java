<%--<%@ page import="models.User" %> --%>

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

    <%--
    <% User user = (User)request.getAttribute("user"); %>

    <hr>
    User Name: <%= user.getName() %> <br>

    Age: <%= user.getAge() %> --%>

    <hr>

    <h3>Through el</h3>
    User Name: ${user.name}
    <br><br>

    Age: ${user.age}
</body>
</html>