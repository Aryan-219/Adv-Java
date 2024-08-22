import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/act.do") 
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();        
        ServletContext context = getServletContext();

        request.setAttribute("marks", 999);
        session.setAttribute("marks", 888);
        context.setAttribute("marks", 777);        

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}