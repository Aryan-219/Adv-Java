<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <!-- '' or "" both will be treated string in EL -->

    ${'omji'}

    <br><br>

    <%--<%= 'kumar' %>--%>

    <br><br>

    <!-- Don't use suffix with constants in EL -->
    
    <%--${3.45f}--%>

    <br><br>

    <%= 3.45f %>
</body>
</html>