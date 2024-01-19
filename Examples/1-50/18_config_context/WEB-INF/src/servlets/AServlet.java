package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // ServletContext context = this.getServletConfig().getServletContext(); 
        ServletContext context = getServletContext();

        ServletConfig config = getServletConfig();
        
        System.out.println(context);
        System.out.println(config);
        
        System.out.println(request);
        System.out.println(response);
    }
}