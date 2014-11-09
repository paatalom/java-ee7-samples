package cu.edu.java.ee7.cdi.alternatives.priority;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

@Priority(1000)
@Alternative
public class FancyGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Nice to meet you, hello" + name;
    }
}
