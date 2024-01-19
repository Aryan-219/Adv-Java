package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.sql.ResultSet;

import org.jasypt.util.password.StrongPasswordEncryptor;

import utils.EmailSender;

public class User {
    private Integer userId;
    private String userName;
    private String email;
    private String password;
    private String myPic;
    private UserType userType;
    private String vcode;
    private Status status;


    static StrongPasswordEncryptor spe = new StrongPasswordEncryptor();

    public User() {

    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public static boolean verifyEmail(String email, String vCode) {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "update users set status_id=?,vcode=null where email=? and vcode=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, Status.ACTIVE_STATUS.getStatusId());
            ps.setString(2, email);
            ps.setString(3, vCode);

            int val = ps.executeUpdate();

            if(val == 1) {
                flag = true;
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }


    public boolean signinUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "select password,user_id,user_name,my_pic,user_type_id from users where email=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                String pwd = rs.getString(1);
                // flag = password.equals(pwd);
                flag = spe.checkPassword(password, pwd);
                if(flag) {
                    userId = rs.getInt(2);
                    userName = rs.getString(3);
                    myPic = rs.getString(4);
                    userType = new UserType(rs.getInt(5));
                    
                    password = null;
                }
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }   

        return flag;
    }

    public boolean signupUser() {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecartdb?user=root&password=1234");

            String query = "insert into users (user_name, email, password, my_pic, user_type_id, vcode, status_id) value (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, spe.encryptPassword(password));
            ps.setString(4, myPic);
            ps.setInt(5, userType.getUserTypeId());
            String verificationCode = Long.toString(new Random().nextLong());
            ps.setString(6, verificationCode);
            // ps.setInt(7, 1);
            ps.setInt(7, Status.INACTIVE_STATUS.getStatusId());

            int res = ps.executeUpdate();
            
            if(res == 1) {
                flag = true;

                EmailSender.sendAccVerificationMail(email, verificationCode);
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getMyPic() {
        return myPic;
    }

    public void setMyPic(String myPic) {
        this.myPic = myPic;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    
}
