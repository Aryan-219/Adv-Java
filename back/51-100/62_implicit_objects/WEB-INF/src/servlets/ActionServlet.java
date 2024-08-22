package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.ArrayList;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<String> list = new ArrayList<>();

        list.add("Chhota Bheem");
        list.add("Kaliya");
        list.add("Chhutki");
        list.add("Raju");
        list.add("Jaggu");
        
        request.setAttribute("pogo_team", list);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}