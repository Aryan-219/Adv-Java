import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class SecondServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");   
        PrintWriter pr=response.getWriter();
        pr.println("<h1>This is my first servlet made html response </h1>");
        // pr.write("<h1>This is my first servlet made html response </h1>");
        pr.println("<hr>");
        // pr.write("<hr>");
        pr.flush();
        pr.close();
    }
}