package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.ArrayList;

import models.Student;

import com.google.gson.Gson;

@WebServlet("/show.do")
public class ShowStudentsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<Student> students = Student.collectAllStudents();
    
        response.getWriter().write(new Gson().toJson(students));
    }
}