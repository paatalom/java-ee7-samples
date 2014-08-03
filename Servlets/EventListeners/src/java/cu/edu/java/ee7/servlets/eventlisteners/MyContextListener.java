package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("+++++++++++ Contect Initialization +++++++++++++++++++");
        System.out.println("Context Path: " + sce.getServletContext().getContextPath());
        System.out.println("Context Server Info: " + sce.getServletContext().getServerInfo());
        System.out.println("+++++++++++ Contect Initialization +++++++++++++++++++");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("+++++++++++ Contect Destroyed +++++++++++++++++++");
        System.out.println("Context Path: " + sce.getServletContext().getContextPath());
        System.out.println("Context Server Info: " + sce.getServletContext().getServerInfo());
        System.out.println("+++++++++++ Contect Destroyed +++++++++++++++++++");
    }
}
