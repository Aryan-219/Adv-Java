package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import models.Student;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Student a = new Student("Kaliya", 10);
       

        request.setAttribute("student", a);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}