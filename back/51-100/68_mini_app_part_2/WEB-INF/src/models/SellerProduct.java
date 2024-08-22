package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SellerProduct {
    private Integer sellerProductId;
    private Product product;
    private User user;
    private Integer quantity;
    private Integer price;

    public SellerProduct() {
        
    }

    public SellerProduct(Product product, User user, Integer quantity, Integer price) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
        this.price = price;
    }

    public void saveProduct() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "insert into seller_products (product_id,user_id,quantity,price) value (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, product.getProductId());
            ps.setInt(2, user.getUserId());
            ps.setInt(3, quantity);
            ps.setInt(4, price);

            int rowCount = ps.executeUpdate();


            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }   
    }

    public Integer getSellerProductId() {
        return sellerProductId;
    }

    public void setSellerProductId(Integer sellerProductId) {
        this.sellerProductId = sellerProductId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    
}
