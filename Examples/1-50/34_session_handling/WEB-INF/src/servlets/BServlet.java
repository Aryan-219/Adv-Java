package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;

@WebServlet("/pro.do")
public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
                
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        
        pw.write("<h1>--------------------------- BServlet -----------</h1>");
        pw.write("<h1>--------------------------- " + session.getId() + " -----" + session.isNew()+"</h1>");
        pw.write("<h1>---- Creation Time: " + new Date(session.getCreationTime())+"</h1>");
        pw.write("<h1>---- Last Accessed Time: " + new Date(session.getLastAccessedTime())+"</h1>");
        pw.write("<h1>+++++++++++++++++++++++++++++++++</h1>");
        pw.write("<a href='aaa.do'>Link to Aaa Page</a>");

        pw.flush();
        pw.close();
    }
} 