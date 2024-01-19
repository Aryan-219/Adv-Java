<%@ page import="javax.servlet.http.Cookie" %>

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

    <a href="next.jsp">Next Page</a>

    <% 
        Cookie c1 = new Cookie("name", "ganesh"); 
        Cookie c2 = new Cookie("age", "23");
        
        response.addCookie(c1);
        response.addCookie(c2);
    %>
</body>
</html>