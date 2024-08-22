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
        
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        pw.write("<h1>Cart Items</h1>");
        pw.write("<hr>");

        if(cart != null) {
            Set<String> productNames = cart.keySet();
            Iterator<String> names = productNames.iterator();            


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
        } else {
            pw.write("<div style='margin:50px auto;width:30%;padding:30px 20px;background-color:#eee;border:1px solid #aaa;border-radius:10px;color:#555;font-family:verdana;text-align:center;font-size:24px;'>");
            pw.write("No products Added yet...");
            pw.write("</div>");
        }


        pw.close();
    }
}