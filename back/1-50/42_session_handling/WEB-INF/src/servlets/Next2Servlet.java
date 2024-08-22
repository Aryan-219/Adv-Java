package servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
        

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<h1>Next2 Page ..... welcome</h1>");

        out.write("<hr>");

        String encodedURL = response.encodeURL("next3.do");

        out.write("<a href='" + encodedURL +"'>Next 3 Page Link</a>");


        out.close();

        // request.getRequestDispatcher("next2.html").forward(request, response);
    }
}