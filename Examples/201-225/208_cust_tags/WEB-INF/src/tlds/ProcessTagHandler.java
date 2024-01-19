package tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ProcessTagHandler extends SimpleTagSupport {
    
    public void doTag() throws IOException, JspException {
        System.out.println("ProcessTagHandler");


        //Case 3:
        // BBBTagHandler parentMost = (BBBTagHandler)findAncestorWithClass(this, BBBTagHandler.class);
        // System.out.println(parentMost);
        
        //Case 2:
        BBBTagHandler parent3 = (BBBTagHandler)((AAATagHandler)(((InfoTagHandler)this.getParent()).getParent())).getParent();
        System.out.println(parent3);

        //Case 1:
        // InfoTagHandler parent1 = (InfoTagHandler)getParent();

        // AAATagHandler parent2 = (AAATagHandler)parent1.getParent();

        // BBBTagHandler parent3 = (BBBTagHandler)parent2.getParent();

        // System.out.println(this);
        // System.out.println(parent1);
        // System.out.println(parent2);
        // System.out.println(parent3);
    }
}