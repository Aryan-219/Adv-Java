<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Next Page</title>
</head>
<body>
    
    <c:if test="${param.num > 75}">  
   <p>Marks: <c:out value="${param.num}"/><p>  
</c:if> 
    <%-- 
    <c:if test="${param.num>=50}">
        <c:out value="Greater than 50" />
    </c:if>
    <c:otherwise>
        <c:out value="Lesser than 50" />
    </c:otherwise>
   
    --%>
</body>
</html>