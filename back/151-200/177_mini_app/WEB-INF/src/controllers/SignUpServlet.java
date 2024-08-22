package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.HttpURLConnection;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import models.User;
import models.UserType;
import utils.AppUtility;
import utils.SMSSender;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;

@WebServlet("/signup.do")
public class SignUpServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String forwardURL = "signup.jsp";

        if(ServletFileUpload.isMultipartContent(request)) {
            ServletContext context = getServletContext();

            try {
                List<FileItem> list = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                String uploadPath = context.getRealPath("/WEB-INF/uploads");

                User user = new User();

                String responseToken = null;

                for(FileItem item : list) {
                    if(item.isFormField()) {
                        String fieldName = item.getFieldName();

                        if(fieldName.equals("user_name")) {
                            user.setUserName(item.getString());
                        } else if(fieldName.equals("email")) {
                            user.setEmail(item.getString());                            
                        } else if(fieldName.equals("password")) {
                            user.setPassword(item.getString());
                        } else if(fieldName.equals("user_type")) {
                            user.setUserType(new UserType(Integer.parseInt(item.getString())));
                        } else if(fieldName.equals("g-recaptcha-response")) {
                            responseToken = item.getString();
                        } else if(fieldName.equals("phone")) {
                            user.setPhone(item.getString());
                        } 
                    } else {    
                        File myFolderPath = new File(uploadPath, user.getEmail());
                        myFolderPath.mkdir();

                        File productsFolder = new File(myFolderPath, "products");
                        productsFolder.mkdir();

                        String originalFileName = item.getName();
                        File file = new File(myFolderPath, originalFileName);
                        user.setMyPic(originalFileName);

                        try {
                            item.write(file); 
                        } catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                
                String recaptchaURL = context.getInitParameter("recaptcha_url");
                String secretKey = context.getInitParameter("secret_key");
                URL url = new URL(recaptchaURL+"?secret="+secretKey+"&response="+responseToken);

                HttpURLConnection con = (HttpURLConnection)url.openConnection();

                con.setRequestMethod("POST");
                con.setDoOutput(true);

                con.connect();

                DataOutputStream dos = new DataOutputStream(con.getOutputStream());

                dos.close();

                InputStream is = null;

                int responseCode = con.getResponseCode();
                if(responseCode == HttpURLConnection.HTTP_OK) {
                    is = con.getInputStream();
                }

                boolean flag = Json.createReader(is).readObject().getBoolean("success");
                
                if(flag && user.signupUser()) { 
                    String otp = Integer.toString(AppUtility.generateOTP());
                    System.out.println(otp + " +++++++++++++++++++++++++");
                    session.setAttribute("otp", otp);  
                    SMSSender.sendOTP(user.getPhone(), otp);                
                    forwardURL = "phone_otp.jsp";
                }
            } catch(FileUploadException e) {
                e.printStackTrace();
            }
        }        
        
        request.getRequestDispatcher(forwardURL).forward(request, response);
    }   
}
// public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
//     String userName = request.getParameter("user_name");
//     String email = request.getParameter("email");
//     String password = request.getParameter("password");
    
//     String forwardURL = "signup.jsp";
//     boolean f1, f2, f3;

//     f1 = f2 = f3 = true;

//     Pattern p1 = Pattern.compile("[A-Za-z ]{2,10}");
//     Matcher unmMatcher = p1.matcher(userName);
    
//     Pattern p2 = Pattern.compile("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}");
//     Matcher emlMatcher = p2.matcher(email);
    
//     Pattern p3 = Pattern.compile("[A-Za-z0-9]{6,12}");
//     Matcher pwdMatcher = p3.matcher(password);

//     if(!unmMatcher.matches()) {
//         request.setAttribute("unm_err", "Please enter valid User Name...!");
//         f1 = false;
//     }
    
//     if(!emlMatcher.matches()) {
//         request.setAttribute("eml_err", "Please enter valid Email...!");
//         f2 = false;
//     }
    
//     if(!pwdMatcher.matches()) {
//         request.setAttribute("pwd_err", "Please enter valid Password...!");
//         f3 = false;
//     }
    
//     if(f1 && f2 && f3) {
//         User user  = new User(userName, email, password);
//         if(user.signupUser()) {
//             forwardURL = "signin.jsp";
//         }
//     } else {
//         System.out.println(f1);
//         System.out.println(f2);
//         System.out.println(f3);
//     }
    
//     // request.getRequestDispatcher(forwardURL).forward(request, response);
//     response.sendRedirect(forwardURL);
// } 