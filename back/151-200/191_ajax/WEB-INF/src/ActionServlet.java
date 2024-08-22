import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import com.google.gson.Gson;

@WebServlet("/send.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String[] names = {"om", "ram", "shyam", "ghanshyam", "khatushyam"};
        
        Gson gson = new Gson();

        String str = gson.toJson(names);


        response.getWriter().write(str);
    }
}