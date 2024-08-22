import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import java.net.URL;
import java.net.HttpURLConnection;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Case 1:
        URL url = new URL("https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf");
        
        //Case 2:
        // String city = request.getParameter("city");
        // URL url = new URL("https://geocoding-api.open-meteo.com/v1/search?name=jabalpur&count=10&language=en&format=json");
        // URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=23.1815&lon=79.9864&appid=b1c89c951dd26a7c52fcae9943031b61");

        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        con.setRequestMethod("GET");
        con.setDoOutput(true);

        DataOutputStream os = new DataOutputStream(con.getOutputStream());

        os.flush();
        os.close();

        int responseCode = con.getResponseCode();

        System.out.println(responseCode + " ----------");

        InputStream is = null;

        if(HttpURLConnection.HTTP_OK == responseCode) {
            is = con.getInputStream();

            // int count = 0;
            // byte[] arr = new byte[256];

            // // response.setContentType("application/pdf");
            
            // ServletOutputStream sos = response.getOutputStream();
            
            // while((count=is.read(arr)) != -1) {
            //     sos.write(arr);
            // }
                
            // sos.flush();
            // sos.close();
                
            response.setContentType("application/json");

            JsonReader jsonReader = Json.createReader(is);

            JsonObject jsonObject = jsonReader.readObject();

            System.out.println(jsonObject.toString()+" +++++++++++++++");
            response.getWriter().write(jsonObject.toString());
        }
    }
}