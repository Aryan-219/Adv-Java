package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport {
    private String name;
    private Integer age;
    private Float marks;

    public void setAge(Integer age) {
        System.out.println("setAge() +++++++++++++++++++++");
        this.age = age;
    }

    public void setMarks(Float marks) {
        System.out.println("setMarks() +++++++++++++++++++++");
        this.marks = marks;
    }

    public void setName(String name) {
        System.out.println("setName() +++++++++++++++++++++");
        this.name = name;
    }
    
    
    public void doTag() throws IOException, JspException {
        System.out.println("doTag() +++++++++++++++++++++");
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}