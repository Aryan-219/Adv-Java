package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/next1.do")
public class Next1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        System.out.println("++++++++++++++ Next1Servlet+++++++++++++++++");
        System.out.println("Session Id: " + session.getId());
        System.out.println("Session is New?: " + session.isNew());
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<h1>Next1 Page ..... welcome</h1>");

        out.write("<hr>");

        String encodedURL = response.encodeURL("next2.do");

        // out.write("<a href='next2.do'>Next 2 Page Link</a>");
        out.write("<a href='" + encodedURL +"'>Next 2 Page Link</a>");


        out.close();

        // request.getRequestDispatcher("next1.html").forward(request, response);
    }
}