<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <h2>Header</h2>: <br><br>

    <%--
    ${header} <br><br>
    ${headerValues}
    --%>

    ${header.host} <br><br>
    ${header['user-agent']} <br><br>
    ${header['accept']} <br><br>
    ${header['accept-language']} <br><br>
    ${header['accept-encoding']} <br><br>
    ${header['accept-charset']} <br><br>
    ${header['cookie']} <br><br>

</body>
</html>