package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import extras.Utility;

@WebServlet("/a3.do")
public class A3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        HashMap<Integer, Integer> factorialMap = (HashMap)request.getAttribute("factorial_map");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<table border='1' align='center'>");
        pw.write("<tr>");
        
        int size = factorialMap.size();

        Set<Integer> factKeys = factorialMap.keySet(); 
        Iterator<Integer> keys = factKeys.iterator();

        while(keys.hasNext()) {
            pw.write("<td valign='bottom'>");
            pw.write("<table>");

            int ky = keys.next();
            int ft = factorialMap.get(ky);
            for(int i=0;i<ft;i++) {
                pw.write("<tr><td>");
                // pw.write("<img src='kaliya.png' width='28'>");
                pw.write("<h1>*</h1>");
                pw.write("</td></tr>");
            }   

            pw.write("</table>");
            pw.write("</td>");
        }


        pw.write("</tr>");
        pw.write("</table>");

        pw.close();
    }
}