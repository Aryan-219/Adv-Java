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

    <!-- Case 1:
        <a href="one.jsp">Page One</a>
    -->
    
    <!-- Case 2: -->
    <%--
    
    <% String encURL = response.encodeURL("one.jsp"); %>
    
    <a href="<%= encURL %>">Page One</a>
    --%>

    <!-- Case 3: 
    <a href="one.jsp">Page One</a>
    -->

    <!-- Case 4: -->

    <a href="<c:url value='one.jsp' />">Page One</a>


    <hr>

    <%= session.getId() %>

    <hr>

    <c:url value='one.jsp' />

</body>
</html>