package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyServletRequestListener.requestDestroyed: " + sre.getServletContext().getContextPath());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyServletRequestListener.requestInitialized: " + sre.getServletContext().getContextPath());
    }
}
