package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

@WebServlet("/delete.do")
public class DeleteProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String[] products = request.getParameterValues("prod");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodsdb?user=root&password=1234");

            String query = "delete from cart_items where product_name=?";

            PreparedStatement ps = con.prepareStatement(query);

            for(String product : products) {
                ps.setString(1, product);
    
                int val = ps.executeUpdate();
                System.out.println(val);
            }


            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("cart.do").forward(request, response);    
    }
}