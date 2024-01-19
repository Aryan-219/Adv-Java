package models;

import java.sql.*;
import java.util.ArrayList;

public class Student {
    private Integer studentId;
    private String name;
    private String college;
    private String degree;
    private String branch;
    private Integer sem;

    public Student(String name, String college, String degree, String branch, Integer sem) {
        this.name = name;
        this.college = college;
        this.degree = degree;
        this.branch = branch;
        this.sem = sem;
    }    

    public Student(Integer studentId, String name, String college, String degree, String branch, Integer sem) {
        this(name, college, degree, branch, sem);
        this.studentId = studentId;        
    }

    public static boolean delete(Integer studentId) {
        boolean flag = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax184db?user=root&password=1234");

            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, studentId);

            int val = ps.executeUpdate();

            if(val == 1)
                flag = true;

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public static ArrayList<Student> collectAllStudents() {
        ArrayList<Student> students = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax184db?user=root&password=1234");

            String query = "select * from students";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return students;
    }

    public boolean save() {
        boolean flag = false;

        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax184db?user=root&password=1234");

            String query = "insert into students (name, college, degree, branch, sem) value (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, college);
            ps.setString(3, degree);
            ps.setString(4, branch);
            ps.setInt(5, sem);

            int res = ps.executeUpdate();

            if(res == 1)
                flag = true;

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flag;
    }

    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Integer getSem() {
        return sem;
    }
    public void setSem(Integer sem) {
        this.sem = sem;
    }    
}