package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        
        PrintWriter pw = response.getWriter();
        
        pw.write("<H1> Response From BServlet - before--- </H1>");
        
        pw.write("<HR>");
        RequestDispatcher view = request.getRequestDispatcher("info.do");
        view.include(request, response);
        
        pw.write("<H1> Response From BServlet - after--- </H1>");

        System.out.println(Thread.currentThread().getName()+ " ++++ BServlet");
        
        
        pw.close();
    }
} 