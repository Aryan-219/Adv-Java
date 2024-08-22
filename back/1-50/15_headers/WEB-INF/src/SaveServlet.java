import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class SaveServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String host = request.getHeader("host");
        String userAgent = request.getHeader("user-agent");
        String accept = request.getHeader("accept");
        String acceptLang = request.getHeader("accept-language");
        String acceptEncoding = request.getHeader("accept-encoding");
        String acceptCharset = request.getHeader("accept-charset");

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<strong>Host:</strong>" + host + "<br><br>");
        pw.write("<strong>User Agent:</strong>" + userAgent + "<br><br>");
        pw.write("<strong>Accept:</strong>" + accept + "<br><br>");
        pw.write("<strong>Accept Language:</strong>" + acceptLang + "<br><br>");
        pw.write("<strong>Accept Encoding:</strong>" + acceptEncoding + "<br><br>");
        pw.write("<strong>Accept Charset:</strong>" + acceptCharset);
    
        pw.close();
    }
}