<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <c:import url="header.jsp">
        <c:param name="klass" value="index" />
    </c:import>

    <hr>
    
    <h1>Index Page</h1>

    <hr>

    <h2>Page Content</h2>

    <a href="next.jsp">Next Page</a>
</body>
</html>