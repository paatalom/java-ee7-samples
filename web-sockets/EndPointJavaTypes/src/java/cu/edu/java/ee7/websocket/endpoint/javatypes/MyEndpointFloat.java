package cu.edu.java.ee7.websocket.endpoint.javatypes;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket-float")
public class MyEndpointFloat {
    
    @OnMessage
    public float echoFloat(Float f) {
        System.out.println("echoFloat");
        return f;
    }
}
