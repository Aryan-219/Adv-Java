import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class SignupServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String userName = request.getParameter("unm");
        String password = request.getParameter("passw");
        String dob = request.getParameter("dob");

        String[] foods = request.getParameterValues("food");
        System.out.println(foods + "------------------");
        response.setContentType("text/html");

        PrintWriter pw= response.getWriter();
        pw.write("<H1>User Name: " + userName + "</H1>");
        pw.write("<H1>Password: " + password + "</H1>");
        pw.write("<H1>Date of Birth: " + dob + "</H1>");
        // pw.write("<H1>Food: " + food + "</H1>");

        for(int i=0;i<foods.length;i++) {
            pw.write("<H1>Food: " + foods[i] + "</H1>");
        }
        
        pw.flush();
        pw.close();
    }
}