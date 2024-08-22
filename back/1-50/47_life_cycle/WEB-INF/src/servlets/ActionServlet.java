package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++47_life_cycle++++++ init() ++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++47_life_cycle+++++++ service() +++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void destroy() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++47_life_cycle++++++ destroy ++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}