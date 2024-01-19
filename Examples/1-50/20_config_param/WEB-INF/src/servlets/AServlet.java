package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletConfig config = getServletConfig();

        String paramValue = config.getInitParameter("key"); 

        System.out.println("+++++++++++ " + paramValue + " +++++++++++++");
    }
}