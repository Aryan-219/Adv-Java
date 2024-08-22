import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("passw");

        // Case 2:
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<h1> Username: " + username + " </h1>");
        pw.println("<h1> Password: " + password + " </h1>");

        // Case 1:
        System.out.println(username);
        System.out.println(password);
    }
}