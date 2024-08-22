import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.sql.*;
import java.util.HashMap;

@WebServlet("/show.do")
public class ShowServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap<String, String> map = new HashMap<>();  
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackdb?user=root&password=1234");

            PreparedStatement ps = con.prepareStatement("select * from messages");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                map.put(rs.getString(2),rs.getString(3));
            }

            request.setAttribute("map", map);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}