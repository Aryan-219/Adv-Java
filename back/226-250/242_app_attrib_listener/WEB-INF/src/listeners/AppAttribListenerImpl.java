package listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class AppAttribListenerImpl implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ app attrib added - 242_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    
    public void attributeRemoved(ServletContextAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ app attrib removed - 242_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    public void attributeReplaced(ServletContextAttributeEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ app attrib replaced - 242_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
}