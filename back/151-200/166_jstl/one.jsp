<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>One Page</h1>

    <hr>

    <!-- Case 1:
        <a href="two.jsp">Two One</a>
    -->
    
    <!-- Case 2: -->
    <% String encURL = response.encodeURL("two.jsp"); %>
    
    <a href="<%= encURL %>">Page Two</a>
    <hr>

    <%= session.getId() %>
    
</body>
</html>