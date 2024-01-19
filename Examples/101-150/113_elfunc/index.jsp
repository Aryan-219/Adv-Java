<%@ taglib prefix="x" uri="http://www.july2023batch.com/eldemo" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>EL Function Demo</h1>

    <hr>

    <!-- Case 1: -->
    ----# ${x:info(340)} #----
    
    <hr>
    
    <!-- Case 2: -->

    <%--
    <% int count = 45; %>
    ----# ${x:info(count)} #----
    --%>

    <!-- Case 3: -->

    <% request.setAttribute("count", 'A'); %>
    ~~~ # ${x:info(count)}  # ~~~~
    <hr>
</body>
</html>