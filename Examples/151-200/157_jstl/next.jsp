<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

    Name: <c:out value="${student.name}" /> <br>
    Age: <c:out value="${student.age}" />
    
    <hr>
    <c:set target="${student}" property="name" value="Raju" />
    <c:set target="${student}" property="age" value="5" />
    
    Name: <c:out value="${student.name}" /> <br>
    Age: <c:out value="${student.age}" />
</body>
</html>