<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.HashMap" %>

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
        HashMap<String,Integer> map = new HashMap<>();
            
        map.put("Doraemon",78);
        map.put("Nobita",23);
        map.put("Ninja Hathodi",99);
        map.put("Xian",12);
        map.put("Suniyo",78);
        map.put("Pokemon",88);
    
        session.setAttribute("records", map); 
    %>
    
    <a href="next.jsp">Next Page</a>

</body>
</html>