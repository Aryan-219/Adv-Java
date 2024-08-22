package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(" ++++++++before+++++++++++++ ASERVLET ++++++++++++++++++++");
        
        RequestDispatcher view = request.getRequestDispatcher("info.do");
        view.include(request, response);

        System.out.println(" +++++++++after++++++++++++ ASERVLET ++++++++++++++++++++");
    
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<H1> Response From AServlet ---- </H1>");

        pw.write("<HR>");

        pw.close();
    }
} 