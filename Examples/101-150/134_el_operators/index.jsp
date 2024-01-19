<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>EL Operators</h1>

    <hr>

    <%
        ArrayList list = new ArrayList();

        // list.add(12);

        pageContext.setAttribute("list", list); 
    %>

    <h3>Is Empty: ${empty list}</h3>

    
</body>
</html>