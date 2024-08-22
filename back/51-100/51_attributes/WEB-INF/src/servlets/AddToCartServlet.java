package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/add.do")
public class AddToCartServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        HashMap<String, Integer> cart = (HashMap)session.getAttribute("cart");
        if(cart == null) {
            cart = new HashMap<>();
            session.setAttribute("cart", cart);
        }

        Enumeration<String> params = request.getParameterNames();

        
        int quantity = Integer.parseInt(request.getParameter("qt"));

        while(params.hasMoreElements()) {
            String param = params.nextElement();
            String value = request.getParameter(param);            

            if(param.equals("qt")||value.equals("0"))
                continue;

            cart.put(value, quantity);
            break;
        }

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}