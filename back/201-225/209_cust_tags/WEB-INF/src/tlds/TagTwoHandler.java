package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagTwoHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
        System.out.println("TagTwoHandler");
    }
}