<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <% int marks = 789; %>

    <%= marks %>

    <br><br>

    <!-- marks will be teated as an attribute saved in any attribute scope... -->
    <!-- if no such attribute, then nothing will be displayed ... -->
    ++++${marks}++++
    <!-- No null pointer exception -->
</body>
</html>