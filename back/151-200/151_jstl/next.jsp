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
        <c:forEach var="ghatna" items="${pracheenkal}">
            <thead>
                <tr>
                    <th colspan="4">
                        <c:out value="${ghatna.key}" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <c:forEach var="vyakti" items="${ghatna.value}">
                        <td>
                            <c:out value="${vyakti}" />
                        </td>
                    </c:forEach>
                </tr>
            </tbody>
        </c:forEach>
    </table>

    
</body>
</html>