package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import models.Student;

@WebServlet("/del.do")
public class DeleteStudentServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer studentId = Integer.parseInt(request.getParameter("student_id"));

        // System.out.println(studentId);

        response.getWriter().print(Student.delete(studentId));
    }
}
