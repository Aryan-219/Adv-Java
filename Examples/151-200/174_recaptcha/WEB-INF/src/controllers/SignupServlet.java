package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        String responseToken = request.getParameter("g-recaptcha-response");
        // String secretKey = "6LfWHJEoAAAAAN-bCHEJJJIFiQLXPZcLW16a";
        String secretKey = "6Le9DJQoAAAAAEcpPgZDDiWTnFZTnvyWQBToKdK2";
        String reqUrl = "https://www.google.com/recaptcha/api/siteverify";

        URL url = new URL(reqUrl+"?secret="+secretKey+"&response="+responseToken);
        HttpURLConnection con = (HttpURLConnection)url.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);

        con.connect();

        DataOutputStream os = new DataOutputStream(con.getOutputStream());

        os.flush();
        os.close();

        int respCode = con.getResponseCode();

        InputStream is = null;

        if(respCode == HttpURLConnection.HTTP_OK) {
            is = con.getInputStream();
        } else {
            is = con.getErrorStream();
        }

        JsonReader jr = Json.createReader(is);
        JsonObject jo = jr.readObject();
        boolean result = jo.getBoolean("success");

        System.out.println("+++++++++++++++++++++++++" + result);
    }
}