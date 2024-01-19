package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<h2>Local Address: " + request.getLocalAddr() + "</h2>");
        pw.write("<h2>Remote Address: " + request.getRemoteAddr() + "</h2>");

        pw.write("<h2>Remote Port: " + request.getRemotePort() + "</h2>");
        pw.write("<h2>Local Port: " + request.getLocalPort() + "</h2>");
        pw.write("<h2>Server Port: " + request.getServerPort() + "</h2>");

        pw.write("<h2>Protocol: " + request.getProtocol() + "</h2>");
        pw.write("<h2>Scheme: " + request.getScheme() + "</h2>");
        pw.write("<h2>Server Name: " + request.getServerName() + "</h2>");
        pw.write("<h2>Is Secure: " + request.isSecure() + "</h2>");

        pw.flush();
        pw.close();
    }
}