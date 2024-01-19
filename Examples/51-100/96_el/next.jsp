<%-- <%@ page import="java.util.HashMap" %> --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <hr>

    <%-- <% HashMap map = (HashMap)request.getAttribute("yam"); %> --%>

    <%-- Map's first key: <%= map.get("3ab") %> <br><br> --%>
    <%-- Map's second key: <%= map.get("#er") %> <br><br> --%>
    <%-- Map's third key: <%= map.get("int") %> <br><br> --%>

    <%-- Map's first key: ${yam.3ab} <br><br> --%>
    <%-- Map's second key: ${yam.#er} <br><br> --%>
    <%-- Map's third key: ${yam.int} <br><br> --%>

    <%-- Attribute: ${float}  --%>

    ${'int'} <br><br>
    ${'^rt'} <br><br>
    ${'444'} <br><br>

</body>
</html>