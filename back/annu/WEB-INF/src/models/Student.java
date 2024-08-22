package models;

public class Student {
    
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentCollege;
    private String studentDegree;
    private String studentBranch;
    private Integer studentSem;

    public Student() {

    }

    public Student(Integer studentId, String studentName, String studentEmail, String studentCollege, String studentDegree, String studentBranch, Integer studentSem) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCollege = studentCollege;
        this.studentDegree = studentDegree;
        this.studentBranch = studentBranch;
        this.studentSem = studentSem;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }

    public String getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(String studentDegree) {
        this.studentDegree = studentDegree;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public Integer getStudentSem() {
        return studentSem;
    }

    public void setStudentSem(Integer studentSem) {
        this.studentSem = studentSem;
    }

    
}