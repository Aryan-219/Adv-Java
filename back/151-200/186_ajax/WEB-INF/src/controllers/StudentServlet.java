package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

import models.Student;

import com.google.gson.Gson;

@WebServlet("/student.do")
public class StudentServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        // String name = request.getParameter("name");
        // String college = request.getParameter("college");
        // String degree = request.getParameter("degree");
        // String branch = request.getParameter("branch");
        // Integer sem = Integer.parseInt(request.getParameter("semester"));

        // Student student = new Student(name, college, degree, branch, sem);

        String params = request.getParameter("params");
        Student student = new Gson().fromJson(params, Student.class);

        response.getWriter().print(student.save());

        //mentos zindagi
        // response.getWriter().print(new Gson().fromJson(request.getParameter("params"), Student.class).save());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("student.html").forward(request, response);
    }
}
