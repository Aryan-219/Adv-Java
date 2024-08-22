<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Implicit Objects Demo: </h1>

    <hr>

    <ol>
        <li><h1>HttpServletRequest:</h1> <%= request %></li>
        <li><h1>HttpServletResponse:</h1> <%= response %></li>
        <li><h1>HttpSession:</h1> <%= session %></li>
        <li><h1>ServletConfig:</h1> <%= config %></li>
        <li><h1>ServletContext:</h1> <%= application %></li>
        <li><h1>JspWriter:</h1> <%= out %></li>
        <li><h1>Object:</h1> <%= page %></li>
        <li><h1>PageContext:</h1> <%= pageContext %></li>
        <li id="aa"></li>
    </ol>

    <script>
        let x = document.getElementById('aa');
        x.innerHTML = <%= 34 %>;
    </script>
</body>
</html>