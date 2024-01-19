package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/a2.do")
public class A2Servlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("------------ 222 load on startup (A2Servlet)---- init");
        System.out.println("------------ 222 load on startup ---- init");
        System.out.println("------------ 222 load on startup ---- init");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("------------ 222 load on startup (A2Servlet) ---- doGet");
        System.out.println("------------ 222 load on startup ---- doGet");
        System.out.println("------------ 222 load on startup ---- doGet");
    }
    
    public void destroy() {
        System.out.println("------------ 222 load on startup (A2Servlet) ---- destroy");
        System.out.println("------------ 222 load on startup ---- destroy");
        System.out.println("------------ 222 load on startup ---- destroy");

    }   
}