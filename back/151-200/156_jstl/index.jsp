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

    <c:set var="aaa" value="111" scope="page" />
    <c:set var="aaa" value="222" scope="request" />
    <c:set var="aaa" value="333" scope="session" />
    <c:set var="aaa" value="444" scope="application" />

    <c:out value="${pageScope.aaa}" />
    <c:out value="${requestScope.aaa}" />
    <c:out value="${sessionScope.aaa}" />
    <c:out value="${applicationScope.aaa}" />
</body>
</html>