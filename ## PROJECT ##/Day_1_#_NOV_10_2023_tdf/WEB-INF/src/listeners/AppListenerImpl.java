package listeners;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;

import java.util.ArrayList;
import models.Country;

public class AppListenerImpl implements ServletContextListener {
    public void contextInitialized(ServletContextEvent ev) {
        ServletContext context = ev.getServletContext();
        System.out.println("############################################");
        System.out.println("############## TDF Starting ###############");
        System.out.println("############################################");
        System.out.println(" -------------- --------------- -------------");
        System.out.println(" -------------- Data Loading -------------");
        System.out.println(" -------------- --------------- -------------");
        System.out.println(" -------------- Countries -------------");
        ArrayList<Country> countries = Country.collectAllCountries();
        context.setAttribute("countries", countries);
        
    }

    public void contextDestroyed(ServletContextEvent ev) {

    }
}
