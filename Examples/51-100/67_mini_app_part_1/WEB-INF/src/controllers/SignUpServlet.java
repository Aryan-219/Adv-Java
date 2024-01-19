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
        System.out.println("dekhte hai kya gadbad hai");
        
        String userName = request.getParameter("user_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println("ab tak samajh nahi aaya");
        
        String forwardURL = "signup.jsp";
        
        System.out.println("na jane kya hogaya hai");
        User user  = new User(userName, email, password);
        if(user.signupUser()) {
            forwardURL = "signin.jsp";
        }
        
        System.out.println("ab to had ho gai");
        request.getRequestDispatcher(forwardURL).forward(request, response);
    } 
}