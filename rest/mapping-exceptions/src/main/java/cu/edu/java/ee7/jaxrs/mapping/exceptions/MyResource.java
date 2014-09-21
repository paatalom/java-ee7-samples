package cu.edu.java.ee7.jaxrs.mapping.exceptions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("order")
public class MyResource {

    @GET
    @Path("{id}")
    public String getOrder(@PathParam("id") int id) {
        if (id % 2 == 0) {
            throw new OrderNotFoundException(id);
        }
        return String.valueOf(id);
    }

}
