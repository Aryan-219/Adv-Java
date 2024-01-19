import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormParameters extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        String uname= request.getParameter("unm");
        String passw= request.getParameter("pw");
        response.setContentType("text/html");
        PrintWriter pw= response.getWriter();
        pw.write("<h1> Username: "+ uname+"</h1>");
        pw.write("<h1> Password: "+ passw+"</h1>");

        pw.flush();
        pw.close();
    }
}