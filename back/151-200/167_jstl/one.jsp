<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>One Page</h1>

    <hr>

    <!-- Case 1:
        <a href="two.jsp">Two One</a>
    -->
    
    <!-- Case 2: -->
    <%--
    <% String encURL = response.encodeURL("two.jsp"); %>
    
    <a href="<%= encURL %>">Page Two</a>
    --%>
    
    <!-- Case 3:
        <a href="two.jsp">Page Two</a>
    -->
    
    <!-- Case 4: -->
    <a href="<c:url value='two.jsp' />">Page Two</a>

    <hr>

    <%= session.getId() %>

    <hr>

    <c:url value='two.jsp' />
    
</body>
</html>