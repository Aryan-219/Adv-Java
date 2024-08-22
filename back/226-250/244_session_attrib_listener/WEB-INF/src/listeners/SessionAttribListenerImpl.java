package listeners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionAttributeListener;

public class SessionAttribListenerImpl implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ session attrib added - 244_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    
    public void attributeRemoved(HttpSessionBindingEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ session attrib removed - 244_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
    public void attributeReplaced(HttpSessionBindingEvent ev) {
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ session attrib replaced - 244_app  ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ " + ev.getName() + " - " + ev.getValue() + " ^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^");
    }
}