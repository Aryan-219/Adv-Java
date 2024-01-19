import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.HashMap;


@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap map = new HashMap();

        map.put("aaa", 555);
        map.put("bbb", 666);
        map.put("ccc", 777);
    
        request.setAttribute("yam", map);
        request.setAttribute("golu", "bbb");

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}