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
    <ul>
        <c:forEach var="dost" items="${doston}">
            <li><c:out value="${dost}" /></li>
        </c:forEach>
    </ul>
</body>
</html>