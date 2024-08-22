package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/a2.do")
public class A2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Object obj = request.getAttribute("king");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>Attrib Value: " + obj + "</h1>");

        pw.close();
    }
}