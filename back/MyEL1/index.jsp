<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%-- 
    <h3>####86_el#####</h3>
    ${12} <br> <br>${"aryan"} <br> <br> ${3.45} <br> <br> ${true} <br> <br>${'A'} <br> <br>
    --%>
    <%-- 
    <h3>####87_el#####</h3>
    <!-- '' or "" both will be treated string in EL -->
    ${'namaskar'} <br>
    ${"swagat hai aapka"}
    <!-- Don't use suffix with constants in EL -->
    <%--${3.45f}--%>
    <br><br>
    <%= 3.45f %>
    
    --%>

    <h3>####88_el#####</h3>
    <% int marks = 789; %>
    <%= marks %>
    <br><br>
    <!-- marks will be teated as an attribute saved in any attribute scope... -->
    <!-- if no such attribute, then nothing will be displayed ... -->
    ++++${marks}++++
    <!-- In other words, No null pointer exception, exception is handled gracefully -->
</body>
</html>