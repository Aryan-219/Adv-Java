package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/next1.do")
public class Next1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Cookie c1 = new Cookie("aaa", "111"); 
        Cookie c2 = new Cookie("bbb", "222"); 
        Cookie c3 = new Cookie("ccc", "333");
        
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        
        request.getRequestDispatcher("next1.html").forward(request, response);
    }
}