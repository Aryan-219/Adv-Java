<%@ page import="java.util.ArrayList,models.Product" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: Add New Products ::</title>

    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form1.css">
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp" %> 
        
        <div id="menu"></div> 
        
        <div id="main_body">
            <% 
                ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products"); 
            %>

            <h1>Add New Product</h1>
            <form action="add.do" method="post">        
                <div id="form_box">                    
                    <div>
                        <div class="label_box">
                            <label for="product">Choose Product :</label>
                        </div>
                        <div class="field_box">
                            <select name="product" required id="product">
                                <option value="0">Select</option>
                                <% for(Product product : products) { %>
                                    <option value="<%= product.getProductId() %>"><%= product.getName() %></option>
                                <% } %>
                            </select>                        
                            <br><small id="eml_err" class="err_msg">Enter valid email...</small>
                        </div>
                    </div>
                    <div>
                        <div class="label_box">
                            <label for="qt">Quantity :</label>
                        </div>
                        <div class="field_box">
                            <input type="number" class="field" required name="quantity" id="qt">
                            <br><small id="pwd_err" class="err_msg">Enter valid password...</small>
                        </div>
                    </div>  
                    <div>
                        <div class="label_box">
                            <label for="prc">Price :</label>
                        </div>
                        <div class="field_box">
                            <input type="number" class="field" required name="price" id="prc">
                            <br><small id="pwd_err" class="err_msg">Enter valid password...</small>
                        </div>
                    </div>  
                    <div>
                        <input type="submit" id="btn" value="Add Product">
                    </div>                  
                </div>      
            </form> 
        </div> 
        
        <%@ include file="footer.jsp" %> 
    </div>
</body>
</html>