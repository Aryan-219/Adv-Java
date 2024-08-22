import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++79_Context_Listener Initialized+++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
    
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++79_Context_Listener Destroyed+++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}