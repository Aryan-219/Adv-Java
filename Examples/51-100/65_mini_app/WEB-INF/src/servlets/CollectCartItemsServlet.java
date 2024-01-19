package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import java.sql.*;

@WebServlet("/cart.do")
public class CollectCartItemsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        HashMap<String,Integer> map = new HashMap<>(); 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodsdb?user=root&password=1234");

            String query = "select * from cart_items";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                map.put(rs.getString(2), rs.getInt(3));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        

        request.setAttribute("cart", map);

        request.getRequestDispatcher("cart.jsp").forward(request, response);
    }
}