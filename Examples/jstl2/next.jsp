<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Next Page</title>
</head>
<body>
    

    <c:choose>
        <c:when test="${param.num>=75}">
            <c:out value="Distinction" />
        </c:when>
        <c:when test="${param.num>=65}">
            <c:out value="First Division" />
        </c:when>
    <c:when test="${param.num>=45}">
        <c:out value="Second Division" />
    </c:when>
    <c:when test="${param.num>=33}">
        <c:out value="Third Division" />
    </c:when>
    <c:otherwise>
        <c:out value="Fail" />
    </c:otherwise>
    </c:choose>
      
    
    
</body>
</html>