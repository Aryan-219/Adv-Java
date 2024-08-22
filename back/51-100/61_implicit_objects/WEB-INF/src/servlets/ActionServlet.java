package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] arr = {"mohan", "ram", "gopal", "kanha", "balram"}; 
        
        request.setAttribute("names", arr);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}