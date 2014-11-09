package cu.edu.java.ee7.cdi.bean.discovery.annotated;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class FancyGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name + ":)";
    }
    
}
