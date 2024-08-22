package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/form2.do")
public class Form2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        Cookie[] cks = request.getCookies();

        pw.write("<form action='save.do'>");

        for(Cookie k : cks) {
            String name = k.getName();
            
            if(name.equals("name")) {
                pw.write("Name: <input type=\"text\" name=\"name\" value='" + k.getValue() + "'> <br><br>");
            } else if(name.equals("email")) {
                pw.write("Email: <input type=\"email\" name=\"email\" value='" + k.getValue() + "'> <br><br>");
            } else if(name.equals("college")) {
                pw.write("College: <input type=\"text\" name=\"college\" value='" + k.getValue() + "'> <br><br>");                
            } else if(name.equals("degree")) {
                pw.write("Degree: <input type=\"text\" name=\"degree\" value='" + k.getValue() + "'> <br><br>");                
            } else if(name.equals("branch")) {
                pw.write("Branch: <input type=\"text\" name=\"branch\" value='" + k.getValue() + "'> <br><br>");                
            } else if(name.equals("semester")) {                
                pw.write("Semester: <input type=\"text\" name=\"semester\" value='" + k.getValue() + "'> <br><br>");
            } else if(name.equals("marks")) {
                pw.write("Marks: <input type=\"number\" name=\"marks\" value='" + k.getValue() + "'> <br><br>");
            } 
        }

        pw.write("<input type='submit' value='Save'>");
        pw.write("</form>");


        pw.close();

        request.getRequestDispatcher("records.html").forward(request, response);    
    }
}