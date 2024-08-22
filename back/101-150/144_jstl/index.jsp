<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>JSTL Demo</h1>

    <hr>
    
    <% 
        String[] arr = {"om", "ram", "shyam", "ghanshyam", "gopal", "umesh"};        
    
        pageContext.setAttribute("records", arr); 
    %>
     
    <!-- Case 1: -->
    <%--
    <% for(int i=0;i<arr.length;i++) { %>
        <h3>
            <%= arr[i] %>
        </h3>
    <% } %>    
    --%>

    <!-- Case 2: -->
    <c:forEach var="nxt" items="${records}">
        <h3>
            <c:out value="${nxt}" />
        </h3>
    </c:forEach>

</body>
</html>