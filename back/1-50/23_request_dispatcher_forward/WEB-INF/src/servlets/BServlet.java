package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(" +++++++++++++++++++++ BSERVLET ++++++++++++++++++++");


        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<H1> Response From BServlet ---- </H1>");

        pw.write("<HR>");

        pw.close();
    }
} 