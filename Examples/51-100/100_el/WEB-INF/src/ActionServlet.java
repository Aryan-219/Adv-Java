import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        int[] arr = {345, 456, 567, 678};

        request.setAttribute("records", arr);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}