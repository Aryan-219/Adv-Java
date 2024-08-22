package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

import java.util.HashMap;

@WebServlet("/act.do")
public class ActionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap map = new HashMap();

        map.put("aaa", 1111);
        map.put("bbb", 2222);
        map.put("ccc", 3333);

        request.setAttribute("records", map);

        // request.getRequestDispatcher("next1.jsp").forward(request, response);
        request.getRequestDispatcher("next2.jsp").forward(request, response);
    }
} 