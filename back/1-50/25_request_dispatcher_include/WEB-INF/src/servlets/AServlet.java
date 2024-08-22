package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        response.setContentType("text/html");
        
        PrintWriter pw = response.getWriter();
        
        pw.write("<H1> Response From AServlet - before--- </H1>");
        
        pw.write("<HR>");
        RequestDispatcher view = request.getRequestDispatcher("info.do");
        view.include(request, response);
        
        pw.write("<H1> Response From AServlet - after--- </H1>");
        
        System.out.println(Thread.currentThread().getName()+ " ++++ AServlet");
        pw.close();
    }
} 