<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Page</title>

    <link rel="stylesheet" href="common.css">
    <link rel="stylesheet" href="form.css">
</head>
<body>
    <div id="main_page_body">
        
        <%@ include file="header.jsp"  %>

        <div id="menu"></div>
        <div id="main_body">
            <table id="form_table">
                <caption>Signup Page</caption>
                <tr>
                    <th width="40%" align="right" style="padding-right: 10px;">
                        <label for="unm">User Name</label>
                    </th>
                    <td width="60%" style="padding-left: 10px;">
                        <input type="text" name="unm" id="unm" class="form_control">
                    </td>
                </tr>
                <tr>
                    <th width="40%" align="right" style="padding-right: 10px;">
                        <label for="eml">Email</label>
                    </th>
                    <td width="60%" style="padding-left: 10px;">
                        <input type="email" name="eml" id="eml" class="form_control">
                    </td>
                </tr>
                <tr>
                    <th width="40%" align="right" style="padding-right: 10px;">
                        <label for="pwd">Password</label>
                    </th>
                    <td width="60%" style="padding-left: 10px;">
                        <input type="password" name="pwd" id="pwd" class="form_control">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Signup" id="btn">
                    </td>
                </tr>
            </table>
        </div>
        <div id="footer">
            <span id="copyr">&copy; ISRDC Jabalpur since 1800AD</span>
        </div>
    </div>    
</body>
</html>