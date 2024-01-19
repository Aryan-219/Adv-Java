package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
// import javax.servlet.jsp.tagext.JspFragment;

import java.io.IOException;

public class TagHandler extends SimpleTagSupport{
    private String name;
    private Integer age;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public void doTag() throws IOException, JspException{   

        System.out.println("!!! Hello Domnast !!!");
        
        // JspFragment frag = getJspBody();
        // System.out.println(frag + "*************");
        System.out.println(name);
        System.out.println(age);
        // frag.invoke(null);
    }
}