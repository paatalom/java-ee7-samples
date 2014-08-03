package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;

@WebListener
public class MySessionIdListener implements HttpSessionIdListener {

    @Override
    public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
        System.out.println("MySessionIdListener.sessionIdChanged: new=" + event.getSession().getId() + ", old=" + oldSessionId);
    }

}
