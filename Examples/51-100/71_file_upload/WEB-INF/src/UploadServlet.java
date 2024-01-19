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
        ServletContext context = getServletContext();

        if(ServletFileUpload.isMultipartContent(request)) {
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            ServletFileUpload sfu = new ServletFileUpload(dfif);

            try {
                List<FileItem> list = sfu.parseRequest(request);

                for(FileItem item : list) {
                    if(!item.isFormField()) {
                        String uploadPath = context.getRealPath("/WEB-INF/uploads");
                        System.out.println(uploadPath + "++++++##++++++++++++++++++ %%%%%%%%%%%%%%");
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