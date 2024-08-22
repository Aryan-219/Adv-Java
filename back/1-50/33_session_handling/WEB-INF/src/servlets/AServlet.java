package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;


@WebServlet("/info.do")
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        
        System.out.println("--------------------------- AServlet -----------");
        System.out.println("--------------------------- " + session.getId() + " -----" + session.isNew());
        System.out.println("---- Creation Time: " + new Date(session.getCreationTime()));
        System.out.println("---- Last Accessed Time: " + new Date(session.getLastAccessedTime()));

        request.getRequestDispatcher("info.html").forward(request, response);
    }
} 