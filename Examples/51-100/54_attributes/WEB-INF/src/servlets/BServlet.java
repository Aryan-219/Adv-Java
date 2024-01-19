package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/a2.do")
public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        ServletContext context = getServletContext();

        Integer aa = (Integer)request.getAttribute("aaa");
        Integer bb = (Integer)session.getAttribute("aaa");
        Integer cc = (Integer)context.getAttribute("aaa");

        System.out.println("~~~~~~~~~~~~~~~~~~~~ BServlet ~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ " + aa + " ~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ " + bb + " ~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ " + cc + " ~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~ ###### ~~~~~~~~~~~~~~~~~");

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}