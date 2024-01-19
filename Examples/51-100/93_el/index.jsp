<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%  pageContext.setAttribute("value", 345); %>
    <%  request.setAttribute("value", 456);     %>
    <%  session.setAttribute("value", 567);     %>
    <%  application.setAttribute("value", 678); %>
    
    
    <hr>

    <h3>Tryna access without el implicit objects</h3>

    ${value} <br>
    ${value}<br>
    ${value}<br>
    ${value}<br>
    
    <hr>


    <h3>Here comes el implicit objects</h3>
    ${pageScope.value} <br>
    ${requestScope.value}<br>
    ${sessionScope.value}<br>
    ${applicationScope.value}<br>


</body>
</html>