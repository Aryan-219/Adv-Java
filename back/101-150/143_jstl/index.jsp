<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>JSTL Demo</h1>

    <hr>
    
    <% pageContext.setAttribute("message", "<script>confirm('Are you Ok?')</script>"); %>
     
    <h3>
        <c:out value="${message}" />
    </h3>
    
    
    <h3>
        <c:out value="${message}" escapeXml="false" />
    </h3>

</body>
</html>