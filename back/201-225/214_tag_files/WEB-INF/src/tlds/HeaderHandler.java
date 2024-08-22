package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HeaderHandler extends SimpleTagSupport {
    private String klass;

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void doTag() throws IOException, JspException {
        JspWriter out = getJspContext().getOut();

        out.write("<link rel='stylesheet' href='common.css'>");

        out.write("<div class='" + klass + "'>");
            out.write("<h1>My Company</h1>");

            out.write("<span>We are the best...</span>");
        out.write("</div>");
    }
}