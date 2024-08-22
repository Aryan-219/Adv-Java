package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

@WebServlet("/signin.do")
public class SignInServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("signin.jsp").forward(request, response);    
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        String forwardPage = "signin.jsp";

        User user = new User(email, password);
        if(user.signinUser()) {
            forwardPage = "dashboard.jsp";
        }

        request.getRequestDispatcher(forwardPage).forward(request, response);
    }
}
