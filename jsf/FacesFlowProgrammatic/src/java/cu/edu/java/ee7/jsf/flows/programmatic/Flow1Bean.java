package cu.edu.java.ee7.jsf.flows.programmatic;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("flow1")
public class Flow1Bean implements Serializable {

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public String getReturnValue() {
        return "/return";
    }

    public String getHomeValue() {
        return "/index";
    }    
}
