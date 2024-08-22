package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        System.out.println(" ++++ AServlet");
    
        // response.sendRedirect("http://amazon.in");
        response.sendRedirect("http://localhost:80/app");
    }
} 