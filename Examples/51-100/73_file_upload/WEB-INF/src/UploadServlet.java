import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException; 
import org.apache.commons.fileupload.FileItem;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        

        if(ServletFileUpload.isMultipartContent(request)) {
            ServletContext context = getServletContext();

            try {
                List<FileItem> list = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                String uploadPath = context.getRealPath("/WEB-INF/uploads");

                for(FileItem item : list) {
                    if(item.isFormField()) {
                        // String fieldName = item.getFieldName();

                        // System.out.println(fieldName + " = " + item.getString());
                        System.out.println(request.getParameter("unm") + " +++++++$$+++++++~~~");
                        System.out.println(request.getParameter("eml") + " ++++++++$$++++++~~~");
                        System.out.println(request.getParameter("pwd") + " +++++++$$+++++++~~~");
                        System.out.println(request.getParameter("phone") + " ++++++$$++++++++~~~");
                    } else {    
                        File file = new File(uploadPath, item.getName());

                        try {
                            item.write(file); 
                        } catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch(FileUploadException e) {
                e.printStackTrace();
            }
        }
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}