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

        user.setName("Barbareek");
        user.setAge(28);
        user.setUserInfo("abcd");

        request.setAttribute("user", user);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}