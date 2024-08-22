import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.HashMap;


@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap map = new HashMap();

        map.put("3ab", 45);
        map.put("#er", 55);
        map.put("int", 65);
    
        request.setAttribute("yam", map);
        request.setAttribute("float", 2.34);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}