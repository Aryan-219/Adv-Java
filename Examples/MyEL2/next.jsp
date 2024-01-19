<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%--
    <h3>###89_el###</h3>
    <!-- Aam Zindagi i.e. Scripting -->
    <%
        Integer x = (Integer)session.getAttribute("marks");
    %>
    $$$ Marks: <%= x %>$$$$ <br> <br>

    <!-- Mentos Zindagi i.e. EL -->
    #### Marks: ${marks}###
    <!-- Here marks is treated either as a jsp implicit, if not , then as an attribute, 
    Note: variable is not allowed in jsp,only constant attribute , bean class are allowed --> 
    <br><br>

    <h3>###90_el###</h3>
    <!-- agar multiple scopes me same naam se attribute save karte hai to narrowest scope ko preference milti hai.
    Here, page scope has the narrowest scope -->
     
    <%
    request.setAttribute("marks", 222); 
    session.setAttribute("marks",333);  
    application.setAttribute("marks",444);  %>
    
    <b>Marks: </b>${marks}
    
    <br><br>
    
    <h3>###91_el###</h3>
    pageContext.setAttribute("marks",111);
    <b>Marks: </b>${marks}
    <br><br>
    <h3>###93_el###</h3>
    <%  pageContext.setAttribute("value", 345); %>
    <%  request.setAttribute("value", 456);     %>
    <%  session.setAttribute("value", 567);     %>
    <%  application.setAttribute("value", 678); %>
    
    
    <hr>
    
    <h3>Tryna access without el implicit objects</h3>
    
    ${value} <br>
    ${value}<br>
    ${value}<br>
    ${value}<br>
    
    <hr>
    
    
    <h3>Here comes el implicit objects</h3>
    ${pageScope.value} <br>
    ${requestScope.value}<br>
    ${sessionScope.value}<br>
    ${applicationScope.value}<br>
    
    
    <br><br>   
    --%>
</body>
</html>