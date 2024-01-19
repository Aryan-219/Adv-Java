import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // String city = request.getParameter("city");
        String[] cities = request.getParameterValues("city");

        String gender = request.getParameter("gender");
        String pic = request.getParameter("pic");

        System.out.println(gender + " ~~~~~~~~~~~");
        System.out.println(pic + " ~~~~~~~~~~~");

        for(String city : cities)
            System.out.println("####" + city + "###");
    }
}