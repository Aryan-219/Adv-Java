import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonArray;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import java.net.URL;
import java.net.HttpURLConnection;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String city = request.getParameter("city");
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?lat=23.1815&lon=79.9864&appid=b1c89c951dd26a7c52fcae9943031b61");

        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        
        con.setRequestMethod("GET");
        con.setDoOutput(true);

        con.connect();

        DataOutputStream os = new DataOutputStream(con.getOutputStream());

        os.flush();
        os.close();

        int responseCode = con.getResponseCode();

        System.out.println(responseCode + " ----------");

        InputStream is = null;

        if(HttpURLConnection.HTTP_OK == responseCode) {
            is = con.getInputStream();

            JsonReader jr = Json.createReader(is);
            JsonObject jo = jr.readObject();

            //Case 1:
            // response.getWriter().write(jo.toString()+"<br>");
            response.getWriter().println(jo.getString("base"));
            response.getWriter().println("timezone: "+jo.getInt("timezone"));

            //Case 2:
            JsonObject joo = jo.getJsonObject("sys");
            response.getWriter().println("country: "+joo.getString("country"));

            //Case 3:
            JsonArray ja = jo.getJsonArray("weather");
            JsonObject jao = ja.getJsonObject(0);
            String res = jao.getString("description");

            response.getWriter().println("description: "+res);
        }
    }
}