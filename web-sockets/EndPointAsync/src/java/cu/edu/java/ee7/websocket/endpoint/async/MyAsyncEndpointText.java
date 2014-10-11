package cu.edu.java.ee7.websocket.endpoint.async;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/text")
public class MyAsyncEndpointText {

    @OnMessage
    public void echoText(String text, Session session) {
        session.getAsyncRemote().sendText(text);
    }
}
