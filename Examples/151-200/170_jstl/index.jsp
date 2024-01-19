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

    <c:url value='one.jsp' var="one" scope="session">
        <c:param name="name" value="golu chacha ji" />
        <c:param name="id" value="#1234" />
    </c:url>
    <c:url value='index.jsp' var="index" scope="session" />
    <p>+++++++++++++++++++++++++++++++++++</p>
    <ul>
        <li><a href="${one}">Page One</a></li>
    </ul>    

    <hr>

    <%= session.getId() %>

    <hr>

</body>
</html>