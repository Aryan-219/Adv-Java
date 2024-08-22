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