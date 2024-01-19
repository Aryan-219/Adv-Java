<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Inde Page</h1>

    <hr>

    <c:set var="aaa" value="vikram" />

    <c:out value="${aaa}" />
    <br>
    <c:out value="${pageScope.aaa}" />

</body>
</html>