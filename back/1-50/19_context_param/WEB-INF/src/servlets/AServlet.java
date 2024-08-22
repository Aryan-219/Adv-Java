package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
         
        ServletContext context = getServletContext();

        String paramValue = context.getInitParameter("control_key");
        System.out.println(paramValue + " ######################## ~~ ############");
    }
}