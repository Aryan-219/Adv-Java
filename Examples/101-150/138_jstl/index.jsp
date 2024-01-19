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

    <h3>
        <%= 12 %>
    </h3>

    <h3>
        ${13}
    </h3>

    <h3>
        <c:out value="14" />
    </h3>
</body>
</html>