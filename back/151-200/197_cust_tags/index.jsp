<%@ taglib prefix="yam" uri="http://myapp.com/meraapp/meratldfile" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <!-- Case 1: -->
    <yam:pro />
    
    <!-- Case 2: -->
    <yam:pro></yam:pro>
    
    <!-- Case 3: -->
    <yam:pro>mohan</yam:pro>

    <!-- Case 4: -->
    <yam:pro>${23}</yam:pro>
    
    <!-- Case 5: -->
    <yam:pro><%= 12 %></yam:pro>
    
    <!-- Case 6: -->
    <yam:pro><c:out value="45" /></yam:pro>
    
</body>
</html>