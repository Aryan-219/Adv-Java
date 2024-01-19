package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import extras.Utility;

@WebServlet("/a2.do")
public class A2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Stack<Integer> stk = (Stack<Integer>)request.getAttribute("first_n_num");
    
        Map<Integer, Integer> factorialMap = new HashMap<>();

        while(!stk.empty()) {
            int rec = stk.pop();
            factorialMap.put(rec, Utility.factorial(rec));
        }

        request.setAttribute("factorial_map", factorialMap);

        request.getRequestDispatcher("a3.do").forward(request, response);
    }
}