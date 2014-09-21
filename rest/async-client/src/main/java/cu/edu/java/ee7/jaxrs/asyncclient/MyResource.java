package cu.edu.java.ee7.jaxrs.asyncclient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("fruits")
public class MyResource {
    private final String[] response = { "apple", "banana", "mango" };
    
    @GET
    public String getList() {
        return response[0];
    }

}
