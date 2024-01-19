package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/info.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        
        System.out.println("--------------------------- AServlet -----------");
        System.out.println("--------------------------- " + session.getId() + " -----" + session.isNew());

        request.getRequestDispatcher("info.html").forward(request, response);
    }
} 