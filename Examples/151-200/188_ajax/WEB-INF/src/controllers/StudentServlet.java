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

        System.out.println("1 ----");
        String params = request.getParameter("params");
        Integer studentId = Integer.parseInt(request.getParameter("st_id"));
        Boolean flag = Boolean.parseBoolean(request.getParameter("save"));
        System.out.println("2 ---- " + params);
        Student student = new Gson().fromJson(params, Student.class);
        System.out.println("3 ---- " + student.getName());
        
        if(flag)
            response.getWriter().print(student.save());
        else
            response.getWriter().print(student.update(studentId));
        System.out.println("4 ---- " );

        //mentos zindagi
        // response.getWriter().print(new Gson().fromJson(request.getParameter("params"), Student.class).save());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("student.jsp").forward(request, response);
    }
}
