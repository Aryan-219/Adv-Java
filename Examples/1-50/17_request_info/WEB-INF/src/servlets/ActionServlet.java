package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h2>HTTP Request Method: " + request.getMethod() + "</h2>");
        pw.write("<h2>Query String: " + request.getQueryString() + "</h2>");
        
        pw.write("<h2>Ek Parameter: " + request.getParameter("name") + "</h2>");
        
        pw.write("<h2>URL: " + request.getRequestURL() + "</h2>");
        pw.write("<h2>URI: " + request.getRequestURI() + "</h2>");
        pw.write("<h2>Servlet Path: " + request.getServletPath() + "</h2>");
        

        pw.flush();
        pw.close();
    }
}