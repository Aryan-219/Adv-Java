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
    <table border="1">
        <c:forEach var="dost" items="${doston}" varStatus="n">
            <tr>
                <td>${n.count}.</td>
                <td>
                    <c:out value="${dost}" />
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>