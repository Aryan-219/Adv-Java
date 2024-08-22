package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        
        pw.write("<H1> Response From CServlet ---- </H1>");

        System.out.println(Thread.currentThread().getName()+ " ++++ CServlet");
    }
} 