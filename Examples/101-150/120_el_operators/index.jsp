<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>EL Operators</h1>

    <hr>

    <%
        pageContext.setAttribute("a", 5);
        pageContext.setAttribute("b", 7);
    %>

    ${a} + ${b} : ${a + b}
</body>
</html>