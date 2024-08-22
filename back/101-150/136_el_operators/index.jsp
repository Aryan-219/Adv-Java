<%@ page import="java.util.HashSet" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>EL Operators</h1>

    <hr>

    <%
        //Case 1:
        //int[] x = {};
        
        //Case 2:
        //int[] x = null;

        //Case 3:
        //Integer x = null;
        
        //Case 4:
        //Integer x = 12;

        //Case 5:
        //HashSet x = new HashSet();
        //x.add(12);

        pageContext.setAttribute("arr", x); 
    %>

    <h3>Is Empty: ${empty arr}</h3>
    <h3>Is Empty: ${empty null}</h3>

    
</body>
</html>