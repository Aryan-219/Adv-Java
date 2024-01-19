package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

@WebServlet("/delete.do")
public class DeleteProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        HashMap<String, Integer> cart = (HashMap)session.getAttribute("cart");
        HashMap<String, Integer> cartClone = (HashMap)cart.clone();

        Set<String> productNames = cart.keySet();
        Iterator<String> names = productNames.iterator();

        String[] products = request.getParameterValues("prod");
        
        for(String product : products) {
            while(names.hasNext()) {
                String productName = names.next();
                if(product.equals(productName)) {
                    cartClone.remove(product);
                    break;
                }
            }
        }

        session.setAttribute("cart", cartClone);

        request.getRequestDispatcher("cart.jsp").forward(request, response);    
    }
}