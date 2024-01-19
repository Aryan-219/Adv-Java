package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ProcessTagHandler extends SimpleTagSupport {
    
    public void doTag() throws IOException, JspException {
        System.out.println("ProcessTagHandler");

        getJspContext().getOut().write("Samosa");

        InfoTagHandler parent = (InfoTagHandler)getParent();

        System.out.println(parent.getLength());
        System.out.println(parent.getWidth());
    }
}