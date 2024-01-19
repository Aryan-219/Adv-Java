import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.ServletContext;
import java.io.OutputStream;
import java.io.InputStream;

public class DynamicResponse extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/pdf");

        ServletContext sc = request.getServletContext();
        InputStream is = sc.getResourceAsStream("/WEB-INF/html_tutorial.pdf");

        OutputStream os = response.getOutputStream();

        int count = 0;
        byte[] arr = new byte[512];

        System.out.println(count);
        while ((count = is.read(arr)) != -1) {
            os.write(arr);
        }
        os.flush();
        os.close();
    }
}
