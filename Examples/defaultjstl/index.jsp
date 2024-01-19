<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%--
    <%
        request.setAttribute("kk",12);
    %>
    --%>
    <c:out value="${kk}" >
        Hello there
        </c:out>
      
</body>
</html>