<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="common.css">
</head>
<body>
    <div class="main_block">
        <c:import url="header.jsp">
            <c:param name="color" value="green" />
            <c:param name="logo" value="logo.png" />
        </c:import>

        <div class="main_box">
            <h3>Index Page</h3>

            <hr>

            <a href="next.jsp">Next Page</a>
        </div>
        <div class="footer">

        </div>
    </div>
</body>
</html>