package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

import java.util.ArrayList;

import models.City;

import com.google.gson.Gson;

@WebServlet("/records.do")
public class CitiesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<City> cities = City.collectAllCities();

        Gson gson = new Gson();

        String respStr = gson.toJson(cities);

        System.out.println(respStr);

        response.getWriter().write(respStr);
    }
}