<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>###WELCOME###</title>

    <link rel="stylesheet" href="common.css">
</head>
<body>
    <div class="main_block">

        <c:import url="header.jsp">
            <c:param name="color" value="red" />
            <c:param name="logo" value="logo_ka_bhai.png" />
        </c:import>

        <div class="main_box">
            <h3>Next Page</h3>

            <hr>
            <a href="index.jsp">Index Page</a>
        </div>

        <div class="footer">
            <h3>Footer</h3>
        </div>
    </div>
</body>
</html>