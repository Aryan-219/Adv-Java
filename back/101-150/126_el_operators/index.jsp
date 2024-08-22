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
        pageContext.setAttribute("a", 12);
        pageContext.setAttribute("b", 17);
        pageContext.setAttribute("c", 6);
        pageContext.setAttribute("d", 8);
    %>

    <h3>12 &lt; 17 &amp;&amp; 8 &gt; 6: ${a < b && d > c}</h3>

    <h3>12 &gt; 17 || 8 &gt; 6: ${a > b || d > c}</h3>  

    <h3>!(12 &lt; 17): ${!(12 < 17)}</h3>
</body>
</html>