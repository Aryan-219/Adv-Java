<%@ page import="java.util.HashMap" %>

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

    <% 
        HashMap<String,String> map = new HashMap<>();

        map.put("Global","9898890890");
        map.put("GGITS","8789878979");
        map.put("GGCT","7966433333");
        map.put("SRIT","8989080890");

        session.setAttribute("map", map);
    %>

    <a href="next.jsp">Next Page</a>
</body>
</html>