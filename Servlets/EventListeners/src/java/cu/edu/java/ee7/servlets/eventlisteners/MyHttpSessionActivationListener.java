package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MyHttpSessionActivationListener implements HttpSessionActivationListener {

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("MyHttpSessionActivationListener.sessionWillPassivate: " + se.getSession().getId());
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("MyHttpSessionActivationListener.sessionDidActivate: " + se.getSession().getId());
    }

}
