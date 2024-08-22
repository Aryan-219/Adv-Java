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
    
        // response.getWriter().write(new Gson().toJson(students));
        String x = "{"id": 8,"title": "Microsoft Surface Laptop 4","description": "Style and speed. Stand out on ...","price": 1499,"discountPercentage": 10.23,"rating": 4.43,"stock": 68,"brand": "Microsoft Surface","category": "laptops","thumbnail": "https://i.dummyjson.com/data/products/8/thumbnail.jpg",
}
"
        response.getWriter().write(new Gson().toJson(x));

    }
}