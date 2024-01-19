<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: Seller Dashboard ::</title>

    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form.css">
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp" %> 
        
        <div id="menu"></div> 
        
        <div id="main_body">
            <h1>Seller DashBoard Page</h1>

            <a href="show.do">Show My Products</a><br><br>
            <a href="add.do">Add products</a>
        </div> 
        
        <%@ include file="footer.jsp" %> 
    </div>
</body>
</html>