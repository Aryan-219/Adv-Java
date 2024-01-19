import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import models.Student;

@WebServlet("/save.do")
public class SaveStudentServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Read the request body
        BufferedReader reader = request.getReader();
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        // Parse the JSON data into a Student object
        String jsonData = sb.toString();
        Student student = new Gson().fromJson(jsonData, Student.class);

        // You can now work with the 'student' object
        System.out.println("Received student data: " + student.toString());

        // Send a response back to the client
        response.getWriter().print("Haa Aaya To Tha Reply");
    }
}