<%@ taglib prefix="z" uri="golu" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        div {
            /* border: 1px solid red; */
            width: 300px;
            height: 300px;
            margin: auto;
            margin-top: 100px;
            text-align: center;
        }

    </style>
</head>
<body>
    <div>
        <a href="index.jsp">
            <img src="images/${z:diceRoll()}.png" alt="">
        </a>
    </div>
</body>
</html>