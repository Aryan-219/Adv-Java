<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: SignIn ::</title>

    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form.css">
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp" %> 
        
        <div id="menu"></div> 
        
        <div id="main_body">
            <form action="signin.do" method="post">
                <table id="form_box">
                    <tr>
                        <th>
                            <label for="eml">Email :</label>
                        </th>
                        <td>
                            <input type="email" id="eml" name="email">
                        </td>
                    </tr>
                    <tr>
                        <th>
                            <label for="pwd">Password :</label>
                        </th>
                        <td>
                            <input type="password" id="pwd" name="password">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="SignIn">
                        </td>
                    </tr>
                </table>
            </form>
        </div> 
        
        <%@ include file="footer.jsp" %> 
    </div>
</body>
</html>