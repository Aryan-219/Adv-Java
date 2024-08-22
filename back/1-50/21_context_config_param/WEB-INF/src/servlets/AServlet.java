package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String contextParamValue1 = getServletContext().getInitParameter("key");
        String contextParamValue2 = getServletConfig().getServletContext().getInitParameter("key");

        String configParamValue1 = getInitParameter("key"); 
        String configParamValue2 = getServletConfig().getInitParameter("key"); 

        System.out.println("+++++++++++ Config Param: " + configParamValue1 + " +++++++++++++");
        System.out.println("+++++++++++ Config Param: " + configParamValue2 + " +++++++++++++");
        System.out.println("+++++++++++ Context Param: " + contextParamValue1 + " +++++++++++++");
        System.out.println("+++++++++++ Context Param: " + contextParamValue2 + " +++++++++++++");
    }
}