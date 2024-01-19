<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
<%@ page import="java.util.HashSet" %>
--%>

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

     
    <!-- Case 1: -->
    <%--
    <% 
        HashSet<String> list = (HashSet)session.getAttribute("records");    
        for(String str : list) { 
    %>
        <h3>
            <%= str %>
        </h3>
    <% } %>    
    --%>

    <!-- Case 2: -->
    
    <c:forEach var="nxt" items="${records}">
        <h3>
            ~<c:out value="${nxt}" />~
        </h3>
    </c:forEach>
    
</body>
</html>