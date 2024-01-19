<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.ArrayList" %>

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
        ArrayList<String> list = new ArrayList<>();
            
        list.add("Doraemon");
        list.add("Nobita");
        list.add("Ninja Hathodi");
        list.add("Xian");
        list.add("Suniyo");
    
        session.setAttribute("records", list); 
    %>
    
    <a href="next.jsp">Next Page</a>

</body>
</html>