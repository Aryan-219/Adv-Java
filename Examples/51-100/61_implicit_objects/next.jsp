<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page ....</h1>

    <hr>

    <h2>Student Names: </h2> 

    <% String[] arr = (String[])request.getAttribute("names");  %>

    <% for(String x : arr) { %>
        <%= x %> <br>
    <% } %>

</body>
</html>