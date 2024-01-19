<%@ page import="models.Student" %>
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

    <!-- Case 1: -->
    Name: <c:out value="${student.name}" /> <br>
    Age: <c:out value="${student.age}" />
    
    <hr>
    <c:set target="${student}" property="name" value="Raju" />
    <c:set target="${student}" property="age" value="5" />

    <%--<c:set target="${student}" property="phone" value="786765433" />--%>
    
    Name: <c:out value="${student.name}" /> <br>
    Age: <c:out value="${student.age}" />


    <!-- Case 2: -->

    <%
        Student x = new Student("ganesh", 12);
    %>

    <c:set var="std" value="<%= x %>" />
    <hr>
    <c:out value="${std.name}" />
    <hr>
</body>
</html>