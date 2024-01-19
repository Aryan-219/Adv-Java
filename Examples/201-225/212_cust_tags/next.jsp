<%@ taglib prefix="y" uri="aaa" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <table border="1" width="30%" align="center">
        <y:forLoop var="city" items="${cities}">
            <tr>
                <td>${city}</td>
            </tr>
        </y:forLoop>
    </table>
</body>
</html>