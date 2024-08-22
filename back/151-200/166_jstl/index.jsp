<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <!-- Case 1:
        <a href="one.jsp">Page One</a>
    -->
    
    <!-- Case 2: -->
    <% String encURL = response.encodeURL("one.jsp"); %>
    
    <a href="<%= encURL %>">Page One</a>
    <hr>

    <%= session.getId() %>

</body>
</html>