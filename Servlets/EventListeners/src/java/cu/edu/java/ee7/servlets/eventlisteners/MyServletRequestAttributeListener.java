package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("MyServletRequestAttributeListener.attributeAdded: " +srae.getName());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("MyServletRequestAttributeListener.attributeRemoved: " +srae.getName());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("MyServletRequestAttributeListener.attributeReplaced: " +srae.getName());
    }

}
