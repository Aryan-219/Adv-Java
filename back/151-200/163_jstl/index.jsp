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
        <%--<%@ include file="header.jsp" %>--%>
        <%--<%@ include file="http://localhost:8080/162_jstl/index.jsp" %>--%>
        <c:import url="header.jsp" />

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