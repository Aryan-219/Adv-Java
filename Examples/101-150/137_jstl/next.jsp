<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>JSTL Intro</h1>

    <hr>

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Message</th>
        </tr>
        <% 
            HashMap<String,String> map = (HashMap)request.getAttribute("map");
            
            Set<String> set = map.keySet();

            for(String s : set) {
                pageContext.setAttribute("name", s);
                pageContext.setAttribute("msg", map.get(s));
        %>
            <tr>
                <td>${name}</td>
                <td>${msg}</td>
            </tr>    
        <% } %>
    </table>
</body>
</html>