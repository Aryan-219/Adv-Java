package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/a1.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        ServletContext context = getServletContext();

        request.setAttribute("aaa", 111);
        session.setAttribute("aaa", 222);
        context.setAttribute("aaa", 333);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}