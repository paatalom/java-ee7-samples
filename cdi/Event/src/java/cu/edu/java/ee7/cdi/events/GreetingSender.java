package cu.edu.java.ee7.cdi.events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class GreetingSender implements EventSender {

    @Inject
    private Event<String> event;

    @Override
    public void send(String message) {
        event.fire(message);
    }
}
