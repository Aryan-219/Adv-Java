package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import models.User;
import models.Product;
import models.SellerProduct;

@WebServlet("/add.do")
public class AddProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        if(user != null) {
            ArrayList<Product> products = Product.collectAllProducts();
            request.setAttribute("products", products);
            
            request.getRequestDispatcher("add_product.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");

        if(user != null) {
            Integer productId = Integer.parseInt(request.getParameter("product"));
            Integer quantity = Integer.parseInt(request.getParameter("quantity"));
            Integer price = Integer.parseInt(request.getParameter("price"));

            SellerProduct sellerProduct = new SellerProduct(new Product(productId), user, quantity, price);
            sellerProduct.saveProduct();

            ArrayList<Product> products = Product.collectAllProducts();
            request.setAttribute("products", products);

            request.getRequestDispatcher("add_product.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }
}
