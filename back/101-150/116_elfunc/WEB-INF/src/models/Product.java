package models;

import java.sql.*;

public class Product {
    private Integer productId;
    private String productName;
    private Integer productQuantity;
    private Integer productPrice;

    public boolean saveProduct() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elfuncdb?user=root&password=1234");

            String query = "insert into products (product_name,product_quantity,product_price) value (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, productName);
            ps.setInt(2, productQuantity);
            ps.setInt(3, productPrice);

            int rs = ps.executeUpdate();

            if(rs == 1) {
                flag = true;
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public Integer getProductId() {
        return productId;
    }
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
    public Integer getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
}