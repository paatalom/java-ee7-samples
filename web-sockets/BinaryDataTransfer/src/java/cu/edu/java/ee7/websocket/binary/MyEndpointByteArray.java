package cu.edu.java.ee7.websocket.binary;

import java.io.IOException;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/bytearray")
public class MyEndpointByteArray {
    @OnMessage
    public byte[] echoBinary(byte[] data) throws IOException {
        return data;
    }
}
