import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.ArrayList;


@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        ArrayList list = new ArrayList<>();

        list.add("dholu");
        list.add("bholu");
        list.add("bheem");
        list.add("chutki");
        list.add("indumati");

        request.setAttribute("dholakpur", list);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}