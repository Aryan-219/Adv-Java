import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SignupServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String name=request.getParameter("unm");
        String password=request.getParameter("passw");
        String food=request.getParameter("food");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<h1> Username: "+ name+ "</h1>");
        pw.write("<h1> Password: "+ password+ "</h1>");
        pw.write("<h1> Food: "+ food+ "</h1>");

        pw.flush();
        pw.close();
    }
}