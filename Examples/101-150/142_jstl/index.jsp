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
    
    <%--<% pageContext.setAttribute("message", "some message"); %>--%>
     
    <h3>
        <c:out value="${message}" default="Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odit, a." />
    </h3>
    
    <h3>
        <c:out value="${message}">
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Obcaecati, sapiente placeat quam harum nostrum tempora odio modi voluptas unde sequi.
        </c:out>
    </h3>

</body>
</html>