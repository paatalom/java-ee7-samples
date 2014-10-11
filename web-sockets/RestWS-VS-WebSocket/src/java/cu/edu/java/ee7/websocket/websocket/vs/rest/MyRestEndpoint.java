package cu.edu.java.ee7.websocket.websocket.vs.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("rest")
public class MyRestEndpoint {

    @POST
    @Produces("text/plain")
    public String getXml(String payload) {
        return payload;
    }
}
