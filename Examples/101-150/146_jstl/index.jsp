<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.HashSet" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>JSTL Demo</h1>

    <hr>
    
    <% 
        HashSet<String> set = new HashSet<>();
            
        set.add("Doraemon");
        set.add("Nobita");
        set.add("Ninja Hathodi");
        set.add("Xian");
        set.add("Suniyo");
        set.add("Pokemon");
    
        session.setAttribute("records", set); 
    %>
    
    <a href="next.jsp">Next Page</a>

</body>
</html>