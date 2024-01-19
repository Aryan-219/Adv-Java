package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport {
    
    String[] names = {"sohan", "mohan", "gohan", "rohan", "tohan", "eohan"};

    public void doTag() throws IOException, JspException {
        JspWriter out = getJspContext().getOut();
        JspFragment frag = getJspBody();
        JspContext jspContext = getJspContext();

        for(String str : names) {
            jspContext.setAttribute("nm", str);
            frag.invoke(null);
        }   
    }
}