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

    <% String[] orders = request.getParameterValues("food"); %>

    <br><br>

    <% try{ %>
        Order: <%= orders[0] %> <br><br>
        Order: <%= orders[1] %> <br><br>
        Order: <%= orders[2] %> <br><br>
    <% } catch(Exception e) { %>
        <font color="red" size="10em">Some Error</font>
    <% } %>

    <h2>Out of danger</h2>
</body>
</html>