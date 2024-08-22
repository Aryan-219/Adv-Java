package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import java.sql.*;

@WebServlet("/add_to_cart.do")
public class AddToCartServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String product = request.getParameter("prod");
        Integer quantity = Integer.parseInt(request.getParameter("qt"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodsdb?user=root&password=1234");

            String query = "insert into cart_items (product_name,quantity) value (?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, product);
            ps.setInt(2, quantity);

            int val = ps.executeUpdate();

            System.out.println(val);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        

        request.getRequestDispatcher("buy.jsp").forward(request, response);
    }
}