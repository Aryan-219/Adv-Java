<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>

    <link rel="stylesheet" href="index.css">
    <link rel="stylesheet" href="common.css">
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp"  %>
        
        <div id="menu"></div>
        <div id="main_body">
            <div id="nav_links">
                <a href="login.jsp">Login</a>
                <a href="signup.jsp">Signup</a>
            </div>
        </div>
        <div id="footer">
            <span id="copyr">&copy; ISRDC Jabalpur since 1800AD</span>
        </div>
    </div>    
</body>
</html>