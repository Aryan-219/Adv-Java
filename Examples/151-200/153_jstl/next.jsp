<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <hr>

    <c:choose>
        <c:when test="${param.num > 100}">
            <font color="red" size="10em">
                <c:out value="${param.num}" />
            </font>
        </c:when>
        <c:otherwise>
            <font color="green" size="5em">
                <c:out value="${param.num}" />
            </font>
        </c:otherwise>
    </c:choose>
</body>
</html>