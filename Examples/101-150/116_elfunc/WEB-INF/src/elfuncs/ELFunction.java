package elfuncs;

import models.Product;

public class ELFunction {
    public static boolean saveProduct(String productName, Integer productQuantity, Integer productPrice) {
        Product p = new Product();

        p.setProductName(productName);
        p.setProductQuantity(productQuantity);
        p.setProductPrice(productPrice);

        return p.saveProduct();
    }
}