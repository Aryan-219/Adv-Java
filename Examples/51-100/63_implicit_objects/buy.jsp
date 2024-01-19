<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>

    <link rel="stylesheet" href="common.css">
    <link rel="stylesheet" href="form.css">
</head>
<body>
    <div id="main_page_body">
        
        <%@ include file="header.jsp"  %>

        <div id="menu"></div>
        <div id="main_body">
            <form action="add_to_cart.do">
                <table id="form_table">
                    <caption>Signin Page</caption>
                    
                    <tr>
                        <th width="40%" align="right" style="padding-right: 10px;">
                            <label for="prod">Select Product</label>
                        </th>
                        <td width="60%" style="padding-left: 10px;">
                            <select name="prod" id="prod" class="form_control">
                                <option>Select</option>                           
                                <option>Laptop</option>
                                <option>RAM</option>
                                <option>HDD</option>
                                <option>SSD</option>
                                <option>Keyboard</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th width="40%" align="right" style="padding-right: 10px;">
                            <label for="qt">Quantity</label>
                        </th>
                        <td width="60%" style="padding-left: 10px;">
                            <input type="number" name="qt" id="qt" class="form_control">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Add To Cart" id="btn">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div id="footer">
            <span id="copyr">&copy; ISRDC Jabalpur since 1800AD</span>
        </div>
    </div>    
</body>
</html>