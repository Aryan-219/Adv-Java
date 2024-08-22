package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
        System.out.println("Ghatotkachha Ki Jay ...");
    }
}