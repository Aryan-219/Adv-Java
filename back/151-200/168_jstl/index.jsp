<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        ul {
            list-style: none;
        }

        ul, li {
            display: inline;
            padding: 7px 12px;
            margin-left: 12px;
            
        }

        li {
            border: 2px solid rgb(208, 6, 120);
            border-radius: 7px;
        }

        li a {
            text-decoration: none;
            color: rgb(208, 6, 120);
        }
    </style>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <c:url value='one.jsp' var="one" scope="session" />
    <c:url value='two.jsp' var="two" scope="session" />
    <c:url value='three.jsp' var="three" scope="session" />

    <!-- Case 1: -->
    <%-- 
    <ul>
        <li><a href="<c:url value='one.jsp' />">Page One</a></li>
        <li><a href="<c:url value='two.jsp' />">Page Two</a></li>
        <li><a href="<c:url value='three.jsp' />">Page Three</a></li>
    </ul>
    --%>

    <!-- Case 2: -->
    <p>+++++++++++++++++++++++++++++++++++</p>
    <ul>
        <li><a href="${one}">Page One</a></li>
        <li><a href="${two}">Page Two</a></li>
        <li><a href="${three}">Page Three</a></li>
    </ul>

    

    <hr>

    <%= session.getId() %>

    <hr>

    <c:url value='one.jsp' />

</body>
</html>