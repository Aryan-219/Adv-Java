package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String contextParamValue1 = getServletContext().getInitParameter("control_key");

        String configParamValue1 = getInitParameter("config_key"); 
        
        System.out.println("+++++++++++ Config Param: " + configParamValue1 + " +++++++++++++");
        System.out.println("+++++++++++ Context Param: " + contextParamValue1 + " +++++++++++++");
    }    
}