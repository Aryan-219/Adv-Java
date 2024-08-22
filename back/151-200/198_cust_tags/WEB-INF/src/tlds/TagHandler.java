package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;

public class TagHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
        System.out.println("Ghatotkachha Ki Jay ...");

        JspFragment frag = getJspBody();

        System.out.println(frag + "~~~~~~~~~~~~~~~~~~");

        frag.invoke(null);
    }
}