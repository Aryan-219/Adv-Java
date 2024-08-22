package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ReqListener implements ServletRequestListener {
    public void requestInitialized(ServletRequestEvent ev) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~app240 init~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void requestDestroyed(ServletRequestEvent ev) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~app240 dstry~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
} 