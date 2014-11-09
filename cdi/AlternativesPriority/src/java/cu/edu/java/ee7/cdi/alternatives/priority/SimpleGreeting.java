package cu.edu.java.ee7.cdi.alternatives.priority;

import javax.enterprise.inject.Alternative;

@Alternative
public class SimpleGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
