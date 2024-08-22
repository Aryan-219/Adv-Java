package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;


@WebServlet(value="/act.do", initParams={@WebInitParam(name="key1", value="ChhotaBheem"),@WebInitParam(name="key2", value="Raju")})
public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletConfig config = getServletConfig();

        String paramValue1 = config.getInitParameter("key1"); 
        String paramValue2 = config.getInitParameter("key2"); 

        System.out.println("+++++++++++ " + paramValue1 + " +++++++++++++" + paramValue2);
    }
}