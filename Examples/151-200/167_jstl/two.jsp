<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Two Page</h1>

    <hr>

    <!-- Case 1:
        <a href="three.jsp">Page Three</a>
    -->
    
    <!-- Case 2: -->
    <%--
    <% String encURL = response.encodeURL("three.jsp"); %>
    <a href="<%= encURL %>">Page Three</a>
    --%>
    
    <!-- Case 3: 
    <a href="three.jsp">Page Three</a>
    -->

    <!-- Case 4: -->

    <a href="<c:url value='three.jsp' />">Page Three</a>


    <hr>

    <%= session.getId() %>
    
    <hr>

    <c:url value='three.jsp' />

</body>
</html>