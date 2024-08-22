package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/next2.do")
public class Next2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cookie[] cks = request.getCookies();

        for(Cookie ck : cks) {
            System.out.println(ck + " - Name: " + ck.getName() + " - Value: " + ck.getValue());
        }
        
        request.getRequestDispatcher("next1.html").forward(request, response);
    }
}