<%@ page import="java.util.Map,java.util.HashMap,java.util.Set" %>

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
            <% Map<String, Integer> cartItems = (HashMap)session.getAttribute("cart"); %>

            <table id="form_table">
                <caption>Cart Items</caption>
                <tr>
                    <th>Name</th>
                    <th>Quantity</th>
                </tr>
                <% 
                    Set<String> productNames = cartItems.keySet();

                    for(String name : productNames) {                         
                %>
                    <tr>
                        <td><%= name %></td>
                        <td><%= cartItems.get(name) %></td>
                    </tr>
                <% } %>
            </table>
        </div>
        <div id="footer">
            <span id="copyr">&copy; ISRDC Jabalpur since 1800AD</span>
        </div>
    </div>    
</body>
</html>