<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<%@ page import="java.util.ArrayList" %>--%>

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

    <%--
    <table border="1">
    
    <% 
        ArrayList<String[]> list = (ArrayList<String[]>)session.getAttribute("pracheenkal"); 

        for(String[] arr : list) {
    %>
            <tr>    
    <% for(String str : arr) {  %>
                <td><%= str %></td>
    <% } %>
            </tr>
    <% } %>

    </table>
    --%>
    
    <%--
    <table border="1">
        <c:forEach var="ghatna" items="${pracheenkal}">
            <tr>
                <c:forEach var="vyakti" items="${ghatna}">
                    <td>
                        ~~<c:out value="${vyakti}" />~~
                    </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
    --%>

    
</body>
</html>