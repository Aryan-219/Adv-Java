package listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("++++++++++++AppListener: contextInitializd+++++++++++++");
        System.out.println("+++++++++++++++++++++++++");
    }
    
    public void contextDestroyed(ServletContextEvent e) {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("++++++++++++AppListener: contextDestrozd+++++++++++++");
        System.out.println("+++++++++++++++++++++++++");
    }
}