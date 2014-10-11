package cu.edu.java.ee7.websocket.endpoint.singleton;

import javax.websocket.server.ServerEndpointConfig;

public class MyConfigurator extends ServerEndpointConfig.Configurator {

    private static final MyEndpoint ENDPOINT = new MyEndpoint();

    @Override
    public <T> T getEndpointInstance(Class<T> endpointClass) throws InstantiationException {
        if (MyEndpoint.class.equals(endpointClass)) {
            return (T) ENDPOINT;
        } else {
            throw new InstantiationException();
        }
    }
}
