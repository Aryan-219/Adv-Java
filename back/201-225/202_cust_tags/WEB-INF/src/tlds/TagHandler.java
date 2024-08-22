package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport {
    private String name;

    public void setName(String name) {
        // System.out.println("setName() +++++++++++++++++++++");
        this.name = name;
    }
    
    
    public void doTag() throws IOException, JspException {
        System.out.println("doTag() +++++++++++++++++++++");
        
        System.out.println(name);
    }
}