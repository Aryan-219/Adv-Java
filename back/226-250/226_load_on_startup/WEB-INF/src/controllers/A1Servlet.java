package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(value="/a1.do", loadOnStartup=2)
public class A1Servlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("------------ 226 load on startup (A1Servlet)---- init");
        System.out.println("------------ 226 load on startup ---- init");
        System.out.println("------------ 226 load on startup ---- init");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("------------ 226 load on startup (A1Servlet) ---- doGet");
        System.out.println("------------ 226 load on startup ---- doGet");
        System.out.println("------------ 226 load on startup ---- doGet");
    }
    
    public void destroy() {
        System.out.println("------------ 226 load on startup (A1Servlet) ---- destroy");
        System.out.println("------------ 226 load on startup ---- destroy");
        System.out.println("------------ 226 load on startup ---- destroy");

    }   
}