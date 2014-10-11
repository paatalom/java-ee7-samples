package cu.edu.java.ee7.websocket.websocket.vs.rest;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class MyWebSocketEndpoint {
    
    @OnMessage
    public String echoText(String text) {
        return text;
    }
}
