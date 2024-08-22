package servlets;

import java.io.IOException;
import java.io.PrintWriter;

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

        System.out.println("++++++++++++++ Next3Servlet+++++++++++++++++");
        System.out.println("Session Id: " + session.getId());
        System.out.println("Session is New?: " + session.isNew());
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<h1>Next3 Page ..... welcome</h1>");
        
        out.write("<hr>");

        out.write("<a href='index.html'>Index Page ..... welcome</h1>");
        
        out.close();

        
        // request.getRequestDispatcher("index.html").forward(request, response);
    }
}