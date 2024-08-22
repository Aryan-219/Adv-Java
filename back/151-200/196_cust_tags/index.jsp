<%@ taglib prefix="yam" uri="http://myapp.com/meraapp/meratldfile" %>

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

    <!-- Case 1: -->
    <yam:pro />
    
    <!-- Case 2: -->
    <yam:pro></yam:pro>
        
    <!-- Case 3: -->
    <%-- <yam:pro> </yam:pro> --%>
    <!-- According to TLD, tag [yam:pro] must be empty, but is not -->
</body>
</html>