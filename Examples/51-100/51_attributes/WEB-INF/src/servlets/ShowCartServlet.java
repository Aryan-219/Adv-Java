package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/show.do")
public class ShowCartServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        HashMap<String, Integer> cart = (HashMap)session.getAttribute("cart");
        Set<String> productNames = cart.keySet();
        Iterator<String> names = productNames.iterator();   

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h1>Cart Items</h1>");

        pw.write("<table border='1' width='30%' align='center'>");
        
        while(names.hasNext()) {
            String nm = names.next();
            Integer quantity = cart.get(nm);
            pw.write("<tr>");
            pw.write("<td>" + nm + "</td>");
            pw.write("<td>" + quantity + "</td>");
            pw.write("</tr>");
        }
        
        pw.write("</table>");

        pw.close();
    }
}