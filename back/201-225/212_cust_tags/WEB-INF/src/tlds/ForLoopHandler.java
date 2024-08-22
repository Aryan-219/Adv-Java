package tlds;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import models.City;

public class ForLoopHandler extends SimpleTagSupport {
    private String var;

    private ArrayList<City> items;

    public void setVar(String var) {
        this.var = var;
    }

    public void setItems(ArrayList<City> items) {
        this.items = items;
    }

    public void doTag() throws IOException, JspException {
        JspFragment frag = getJspBody();
        JspContext jspContext = getJspContext();

        for(City city : items) {
            jspContext.setAttribute(var, city.getName());
            frag.invoke(null);
        }   
    }
}