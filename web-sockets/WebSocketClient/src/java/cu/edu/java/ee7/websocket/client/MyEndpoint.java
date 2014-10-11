package cu.edu.java.ee7.websocket.client;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/websocket")
public class MyEndpoint {
    
    @OnMessage
    public String sayHello(String name) {
        System.out.println("Received message in endpoint : " + name);
        return "Hello " + name;
    }
    
}
