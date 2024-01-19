package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/next3.do")
public class Next3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        System.out.println("++++++++++++++ Next2Servlet+++++++++++++++++");
        System.out.println("Session Id: " + session.getId());
        System.out.println("Session is New?: " + session.isNew());
        
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}