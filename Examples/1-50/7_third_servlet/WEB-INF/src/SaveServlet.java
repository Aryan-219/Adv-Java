import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SaveServlet extends HttpServlet {
    static int count = 0;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");        

        PrintWriter out = response.getWriter();

        out.write("<h1>Dynamic Response....</h1>");

        out.write("<hr>");

        out.write("<strong>" + count++ + "</strong>");

        out.flush();
        out.close();
    }
}