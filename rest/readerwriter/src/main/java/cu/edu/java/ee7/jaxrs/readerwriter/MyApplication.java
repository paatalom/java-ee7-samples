package cu.edu.java.ee7.jaxrs.readerwriter;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webresources")
public class MyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(MyResource.class);
        resources.add(MyReader.class);
        resources.add(MyWriter.class);
        return resources;
    }
}
