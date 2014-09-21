package cu.edu.java.ee7.jaxrs.server.negotiation;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("persons")
public class MyResource {
    @GET
    @Produces({"application/xml; qs=0.75", "application/json; qs=1.0"})
    public List<Person> getList() {
        People list = new People();
        list.add(new Person("Penny", 1));
        list.add(new Person("Leonard", 2));
        list.add(new Person("Sheldon", 3));
        
        return list;
    }
}
