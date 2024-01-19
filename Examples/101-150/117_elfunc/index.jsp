<%@ taglib prefix="a" uri="golu" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>ELFunc Demo</h1>

    <hr>

    <select>
        <% 
            for(int i=0;i<6;i++) { 
            pageContext.setAttribute("attr", i);
        %>
            ${a:showInfo(pageContext,attr)}
            <option>${next}</option>
        <% } %>
    </select>
</body>
</html>