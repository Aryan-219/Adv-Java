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
            try {
                List<FileItem> fileItems = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                
                FileItem fileItem = fileItems.get(0);

                String uploadPath = getServletContext().getRealPath("/WEB-INF");
                File file = new File(uploadPath, fileItem.getName());
                
                try{
                    fileItem.write(file);
                } catch(Exception e) {
                    e.printStackTrace();
                }                
            } catch(FileUploadException e) {
                e.printStackTrace();
            }
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}