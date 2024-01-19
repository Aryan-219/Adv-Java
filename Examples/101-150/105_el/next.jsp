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

    <!-- Scripting -->

    <% String[] foods = request.getParameterValues("food"); %>

    <%= foods[0] %>, <%= foods[1] %>, <%= foods[2] %>
    
    <hr>

    <!-- EL -->

    Food Selection: ${paramValues.food[0]}, ${paramValues.food[1]}, ${paramValues.food[2]}

    <hr>

    City Selection: ${paramValues.city[0]}, ${paramValues.city[1]}, ${paramValues.city[2]}
</body>
</html>