<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
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
        HashMap<String,Integer> list = (HashMap)session.getAttribute("records");    
        for(Object str : list) { 
    %>
        <h3>
            <%= str %>
        </h3>
    <% } %>    
    --%>    
    <!--
        An error occurred at line: [23] in the jsp file: [/next.jsp]
Can only iterate over an array or an instance of java.lang.Iterable

    -->

    <!-- Case 2: -->
    <%--
    <% 
        HashMap<String,Integer> map = (HashMap)session.getAttribute("records");    
        Set<String> set = map.keySet(); 
        
        for(String key : set) { 
    %>
        <h3>
            <%= key %>: <%= map.get(key) %>
        </h3>
    <% } %>
    --%>

    <!-- Case 3: -->
    
    <c:forEach var="nxt" items="${records}">
        <h3>
            ~~~~~<c:out value="${nxt.key}" />: <c:out value="${nxt.value}" /> 
        </h3>
    </c:forEach>
    
</body>
</html>