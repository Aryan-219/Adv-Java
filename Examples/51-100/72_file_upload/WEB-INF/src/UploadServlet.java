import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

@WebServlet("/upload_pic.do")
public class UploadServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(ServletFileUpload.isMultipartContent(request)) {
            DiskFileItemFactory dfif = new DiskFileItemFactory();
            
            ServletFileUpload sfu = new ServletFileUpload(dfif);

            try {
                List<FileItem> list = sfu.parseRequest(request);

                for(FileItem item : list) {
                    String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads");

                    File file = new File(uploadPath, item.getName());

                    if(!item.isFormField()) {
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