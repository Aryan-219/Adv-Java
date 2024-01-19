package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(" +++++++++++++++++++++ ASERVLET ++++++++++++++++++++");

        RequestDispatcher view = request.getRequestDispatcher("pro.do");
        view.forward(request, response);
    }
} 