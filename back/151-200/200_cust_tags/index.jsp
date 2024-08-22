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

    <k:process name="yamraj" />
    
    <%-- <k:process /> --%>
    <!--
        According to the TLD or the tag file, attribute [name] is mandatory for tag [process]
    -->
</body>
</html>