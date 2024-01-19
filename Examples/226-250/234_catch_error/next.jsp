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

    <hr>

    <% String[] orders = request.getParameterValues("food"); %>

    <br><br>

    <c:catch>
        Order: <%= orders[0] %> <br><br>
        Order: <%= orders[1] %> <br><br>
        Order: <%= orders[2] %> <br><br>
    </c:catch>

    <h2>Out of danger</h2>
</body>
</html>