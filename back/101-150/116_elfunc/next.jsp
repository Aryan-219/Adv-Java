<%@ taglib prefix="mkt" uri="market" %>

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

    ${mkt:saveRecord(param.pname, param.pqt, param.prc)}
</body>
</html>