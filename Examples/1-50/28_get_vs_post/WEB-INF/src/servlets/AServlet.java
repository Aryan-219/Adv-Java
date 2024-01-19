package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Hello Duniya Walon......POST");
        System.out.println("##### IMPORTANT JOB ##########");
        System.out.println(request.getParameter("college") + " ++++ POST");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Hello Duniya Walon......GET");

        System.out.println(request.getParameter("college") + " ++++ GET");
        
        doPost(request, response);
    }
}