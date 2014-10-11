package cu.edu.java.ee7.websocket.binary;

import java.io.IOException;
import java.nio.ByteBuffer;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/bytebuffer")
public class MyEndpointByteBuffer {
    @OnMessage
    public ByteBuffer echoBinary(ByteBuffer data) throws IOException {
        System.out.println("echoBinary");
        return data;
    }
}
