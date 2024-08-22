package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;


@WebServlet(value="/act.do", initParams=@WebInitParam(name="key", value="xyzte2"))
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletConfig config = getServletConfig();

        String paramValue = config.getInitParameter("key"); 

        System.out.println("+++++++++++ " + paramValue + " +++++++++++++");
    }
}