<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next page</h1>

    <hr>

    ${map}

    <hr>
    <c:set target="${map}" property="GGCT" value="999999999" />

    ${map}
</body>
</html>