package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/save.do")
public class Form1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String college = request.getParameter("college");
        String degree = request.getParameter("degree");
        String branch = request.getParameter("branch");
        String semester = request.getParameter("semester");
        String marks = request.getParameter("marks");

        Cookie c1 = new Cookie("name", name);
        Cookie c2 = new Cookie("email", email);
        Cookie c3 = new Cookie("college", college);
        Cookie c4 = new Cookie("degree", degree);
        Cookie c5 = new Cookie("branch", branch);
        Cookie c6 = new Cookie("semester", semester);
        Cookie c7 = new Cookie("marks", marks);

        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        response.addCookie(c5);
        response.addCookie(c6);
        response.addCookie(c7);

        request.getRequestDispatcher("records.html").forward(request, response);    
    }
}