<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <!-- Aam Zindagi: scripting -->

    <% Integer marks = (Integer)request.getAttribute("marks"); %>

    <h3>Marks: <%= marks %></h3>

    <br><br>

    <font color="red">Marks: ${marks}</font>
</body>
</html>