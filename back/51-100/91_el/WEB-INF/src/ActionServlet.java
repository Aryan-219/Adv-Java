import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/act.do") 
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();        
        ServletContext context = getServletContext();

        request.setAttribute("name", "raju");
        session.setAttribute("name", "kaliya");
        context.setAttribute("name", "chhotabheem");        

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}