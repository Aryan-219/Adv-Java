import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Enumeration paramNames = request.getParameterNames();
        
        while(paramNames.hasMoreElements()) {
            System.out.println(paramNames.nextElement());
        }
    }
}