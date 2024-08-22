import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String unm = request.getParameter("unm");
        String passw = request.getParameter("passw");
        String[] foods = request.getParameterValues("foods");
        String gender = request.getParameter("gender");
        String[] cities = request.getParameterValues("cities");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<strong> Username: </strong>" + unm);
        pw.println("<strong> Password: </strong>" + passw);
        pw.println("<strong> Gender: </strong>" + gender);

        for (String city : cities) {

            pw.println("<strong> City: </strong>" + city);
        }

        for (String food : foods) {

            pw.println("<strong> Food: </strong>" + food);
        }

    }
}