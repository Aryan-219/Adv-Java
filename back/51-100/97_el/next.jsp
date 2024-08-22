<%-- <%@ page import="java.util.ArrayList" %> --%>

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

    <%-- 
    <% ArrayList list = (ArrayList)request.getAttribute("dholakpur"); %>

    1. <%= list.get(0) %> <br><br>
    2. <%= list.get(1) %> <br><br>
    3. <%= list.get(2) %> <br><br>
    4. <%= list.get(3) %> <br><br>
    5. <%= list.get(4) %> <br><br> --%>

    1. ${dholakpur[0]} --  <br><br>
    2. ${dholakpur[1]} --  <br><br>
    3. ${dholakpur[2]} --  <br><br>
    4. ${dholakpur[3]} --  <br><br>
    5. ${dholakpur[4]} --  <br><br>
</body>
</html>