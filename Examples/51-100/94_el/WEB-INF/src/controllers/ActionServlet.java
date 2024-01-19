package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

import models.User;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = new User();
        user.setName("kushal");
        user.setAge(24);

        request.setAttribute("user", user);

        // request.getRequestDispatcher("next1.jsp").forward(request, response);
        request.getRequestDispatcher("next2.jsp").forward(request, response);
    }
} 