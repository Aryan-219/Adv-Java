package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.Stack;

@WebServlet("/a1.do")
public class A1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String input = request.getParameter("inp");
        int inp = Integer.parseInt(input);

        Stack<Integer> stk = new Stack<>();

        for(int i=1;i<=inp;i++) {
            stk.push(i);
        }

        request.setAttribute("first_n_num", stk);

        request.getRequestDispatcher("a2.do").forward(request, response);
    }
}