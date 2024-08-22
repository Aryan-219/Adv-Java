package models;

import java.sql.*;
import java.util.*;

public class SellerProductImage {
    //Fields ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private Integer sellerProductImageId;
    private SellerProduct sellerProduct;
    private String imagePath;

    //Constructors +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



    //Other Methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static ArrayList<Integer> collectProductImageIds(Integer sellerProductId) {
        ArrayList<Integer> sellerProductImageIds = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "select seller_product_image_id from seller_product_images where seller_product_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, sellerProductId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                sellerProductImageIds.add(rs.getInt(1)); 
            }   

        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return sellerProductImageIds;
    }
    
    public static void saveImages(ArrayList<String> imagePaths, Integer sellerProductId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "insert into seller_product_images (seller_product_id,image_path) value (?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, sellerProductId);

            for(String imagePath : imagePaths) {
                ps.setString(2, imagePath);
                ps.executeUpdate();
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Getter-Setters +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public Integer getSellerProductImageId() {
        return sellerProductImageId;
    }
    public void setSellerProductImageId(Integer sellerProductImageId) {
        this.sellerProductImageId = sellerProductImageId;
    }
    public SellerProduct getSellerProduct() {
        return sellerProduct;
    }
    public void setSellerProduct(SellerProduct sellerProduct) {
        this.sellerProduct = sellerProduct;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}