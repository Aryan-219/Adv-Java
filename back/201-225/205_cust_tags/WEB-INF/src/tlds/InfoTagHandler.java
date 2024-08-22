package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class InfoTagHandler extends SimpleTagSupport {
    private Integer length;
    private Integer width;    

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void doTag() throws IOException, JspException {
        System.out.println("InfoTagHandler");

        getJspBody().invoke(null);

        getJspContext().getOut().write("Jalebi");
    }
}
