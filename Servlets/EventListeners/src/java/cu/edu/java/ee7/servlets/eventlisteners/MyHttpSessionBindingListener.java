package cu.edu.java.ee7.servlets.eventlisteners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyHttpSessionBindingListener implements HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("MyHttpSessionBindingListener.valueBound: " + event.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("MyHttpSessionBindingListener.valueUnbound: " + event.getName());
    }

}
