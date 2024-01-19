package controllers;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import models.User;

@WebServlet("/signup.do")
public class SignUpServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }    

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("user_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String forwardURL = "signup.jsp";

        User user  = new User(userName, email, password);
        if(user.signupUser()) {
            forwardURL = "signin.jsp";
        }
        
        request.getRequestDispatcher(forwardURL).forward(request, response);
    } 
}