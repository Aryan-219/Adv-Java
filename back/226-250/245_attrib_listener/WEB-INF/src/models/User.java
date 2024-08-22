package models;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    private String name;
    private Integer age;   

    public void valueBound(HttpSessionBindingEvent ev) {
        System.out.println("################ ################");
        System.out.println("################ 245_app: bound ################");
        System.out.println("################ ################");
    }

    public void valueUnbound(HttpSessionBindingEvent ev) {
        System.out.println("################ ################");
        System.out.println("################ 245_app: unbound ################");
        System.out.println("################ ################");
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }    
}