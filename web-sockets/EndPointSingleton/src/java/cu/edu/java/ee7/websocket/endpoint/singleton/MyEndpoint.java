package cu.edu.java.ee7.websocket.endpoint.singleton;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/websocket", configurator = MyConfigurator.class)
public class MyEndpoint {
    String newValue = "";
    
    /**
    * singleton instance of endpoint ensures that string concatenation would work
    */
    @OnMessage
    public String concat(String value) {
        this.newValue += value;
        
        return newValue;
    }
}
