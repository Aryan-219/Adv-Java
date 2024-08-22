package listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ReqAttribListenerImpl implements ServletRequestAttributeListener {
    public void attributeAdded(ServletRequestAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ req attrib added - 243_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    
    public void attributeRemoved(ServletRequestAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ req attrib removed - 243_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    public void attributeReplaced(ServletRequestAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ req attrib replaced - 243_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
}