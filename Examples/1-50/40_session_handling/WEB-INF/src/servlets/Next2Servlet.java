package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/next2.do")
public class Next2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        System.out.println("++++++++++++++ Next2Servlet+++++++++++++++++");
        System.out.println("Session Id: " + session.getId());
        System.out.println("Session is New?: " + session.isNew());
        System.out.println("Session Creation Time: " + session.getCreationTime());
        System.out.println("Session Last Accessed Time: " + session.getLastAccessedTime());
        System.out.println("Session Max Inactive Interval: " + session.getMaxInactiveInterval());

        session.invalidate();

        // session.invalidate(); 
        session.getCreationTime(); 
        // session.getLastAccessedTime(); 

        request.getRequestDispatcher("next2.html").forward(request, response);
    }
}