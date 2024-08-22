package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;

import models.*;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        HashMap map = new HashMap<>();
        
        map.put("students", new Student[]{
            new Student("mohan", 18, "GGCT"),
            new Student("sohan", 21, "JEC"),
            new Student("rohan", 22, "SRIT")
        });

        map.put("employees", new Employee[]{
            new Employee("harshit", 10, 10000000),
            new Employee("vaibhav", 5, 3000000),
            new Employee("jagdeep", 15, 700000000)
        });
        
        request.setAttribute("recs", map);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}