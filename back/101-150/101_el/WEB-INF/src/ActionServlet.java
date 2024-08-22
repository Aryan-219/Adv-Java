import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        HashMap map = new HashMap<>();
        
        map.put("sabzi", new String[]{"bareja", "bathua", "cholai", "norpa"});
        map.put("fal", new String[]{"papita", "sab", "santara", "angoor"});
        map.put("sanganak", new String[]{"laptop", "desktop", "tablet", "smartphone"});

        request.setAttribute("recs", map);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}