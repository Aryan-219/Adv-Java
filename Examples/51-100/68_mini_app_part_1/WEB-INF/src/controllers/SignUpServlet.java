package controllers;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
        boolean f1, f2, f3;

        f1 = f2 = f3 = true;

        Pattern p1 = Pattern.compile("[A-Za-z ]{2,10}");
        Matcher unmMatcher = p1.matcher(userName);
        
        Pattern p2 = Pattern.compile("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}");
        Matcher emlMatcher = p2.matcher(email);
        
        Pattern p3 = Pattern.compile("[A-Za-z0-9]{6,12}");
        Matcher pwdMatcher = p3.matcher(password);

        if(!unmMatcher.matches()) {
            request.setAttribute("unm_err", "Please enter valid User Name...!");
            f1 = false;
        }
        
        if(!emlMatcher.matches()) {
            request.setAttribute("eml_err", "Please enter valid Email...!");
            f2 = false;
        }
        
        if(!pwdMatcher.matches()) {
            request.setAttribute("pwd_err", "Please enter valid Password...!");
            f3 = false;
        }
        
        if(f1 && f2 && f3) {
            User user  = new User(userName, email, password);
            if(user.signupUser()) {
                forwardURL = "signin.jsp";
            }
        } else {
            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
        }
        
        // request.getRequestDispatcher(forwardURL).forward(request, response);
        response.sendRedirect(forwardURL);
    } 
}