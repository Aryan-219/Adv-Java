package models;

public class User {
    private String name;
    private Integer age;
    private String userInfo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
    // public String getname() {
    // public String findName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    // public String getUserInfo() {
    // public String getuserinfo() {   //not ok
    public String getuserInfo() {
        return userInfo;
    }
}
