package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.ArrayList;

import models.City;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<City> cities = City.collectCities();

        request.setAttribute("cities", cities);

        request.getRequestDispatcher("next.jsp").forward(request, response);
    }
}
