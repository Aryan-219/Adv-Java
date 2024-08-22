package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.fileupload.disk.*;

import models.User;

@WebServlet("/product_pic_upload.do")
public class ProductImagesUploadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("product_pic_upload.jsp").forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        User user = (User)session.getAttribute("user");
        
        String forwardPage = "signin.jsp";

        if(user != null) {
            if(ServletFileUpload.isMultipartContent(request)) {
                try {
                    List<FileItem> images = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                
                    ArrayList<String> imagePaths = new ArrayList<>();
                    for(FileItem image : images) {
                        String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads/"+user.getEmail()+"/products");

                        File productFolder = new File(uploadPath, );

                    }

                    forwardPage = "product_pic_upload.jsp";
                } catch() {
                    
                }
            }   
        } 
        
        request.getRequestDispatcher(forwardPage).forward(request, response);
    }
}
