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
        <c:when test="${param.num >= 75}">
            <font color="white" size="10em">
                <span style="background-color:#154606">Distinction</span>
            </font>
        </c:when>
        <c:when test="${param.num >= 60}">
            <font color="white" size="10em">
                <span style="background-color:#31a40f">First Division</span>
            </font>
        </c:when>
        <c:when test="${param.num >= 45}">
            <font color="white" size="10em">
                <span style="background-color:#40d313">Second Division</span>
            </font>
        </c:when>
        <c:when test="${param.num >= 33}">
            <font color="white" size="10em">
                <span style="background-color:#a3f58a">Third Division</span>
            </font>
        </c:when>
        <c:otherwise>
            <font color="white" size="10em">
                <span style="background-color:#d31327">Fail</span>
            </font>
        </c:otherwise>
    </c:choose>
</body>
</html>