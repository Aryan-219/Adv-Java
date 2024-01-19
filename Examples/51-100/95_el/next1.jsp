<%@ page import="java.util.HashMap" %>

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

    <% HashMap map = (HashMap)request.getAttribute("records"); %>

    <hr>
    Value of Key aaa: <%= map.get("aaa") %> <br>
    Value of Key bbb: <%= map.get("bbb") %> <br>
    Value of Key ccc: <%= map.get("ccc") %> <br>
</body>
</html>