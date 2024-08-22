<%@ taglib prefix="k" uri="http://localhost:8080/199_cust_tags/app_tld" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

    <k:process>12</k:process>
    
    <hr>

    <k:process>${'golu'}</k:process>
    
    <hr>

    <%--<k:process><%= true %></k:process>--%>

    <!--
        Scripting elements ( &lt;%!, &lt;jsp:declaration, &lt;%=, &lt;jsp:expression, &lt;%, &lt;jsp:scriptlet ) are disallowed here.
    -->
    
    <hr>

    <k:process><c:out value="34.56" /></k:process>
    
</body>
</html>