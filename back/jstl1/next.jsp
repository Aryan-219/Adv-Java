<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import= "java.util.TreeMap, java.util.Set" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
  
    $$$$$
    <c:forEach var="arr" items = "${people}" >
        <c:forEach var="name" items = "${arr.value}" varStatus="n">
            <c:out value="${name}" />
            <c:out value="${n.count-1}" />


        </c:forEach>
    </c:forEach> 
    $$$$$
   
</body>
</html>