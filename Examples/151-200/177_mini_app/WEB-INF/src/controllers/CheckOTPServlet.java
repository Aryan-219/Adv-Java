package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/check_otp.do")
public class CheckOTPServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String savedOTP = (String)session.getAttribute("otp");

        String otp = request.getParameter("otp");

        if(otp.equals(savedOTP)) {
            response.sendRedirect("signin.jsp");
        } 
    }
}
