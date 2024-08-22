package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/add_to_cart.do")
public class AddToCartServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        Map<String, Integer> cartMap = (HashMap)session.getAttribute("cart");

        if(cartMap == null) {
            cartMap = new HashMap<>();
            session.setAttribute("cart", cartMap);
        }

        String product = request.getParameter("prod");
        Integer quantity = Integer.parseInt(request.getParameter("qt"));

        cartMap.put(product, quantity);

        request.getRequestDispatcher("buy.jsp").forward(request, response);
    }
}