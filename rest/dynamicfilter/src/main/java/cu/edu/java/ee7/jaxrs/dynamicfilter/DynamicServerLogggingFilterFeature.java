package cu.edu.java.ee7.jaxrs.dynamicfilter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
public class DynamicServerLogggingFilterFeature implements DynamicFeature {

    @Override
    public void configure(ResourceInfo ri, FeatureContext fc) {
            fc.register(new ServerLoggingFilter());
    }
}
