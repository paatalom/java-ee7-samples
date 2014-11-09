package cu.edu.java.ee7.cdi.alternatives.priority;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

@Priority(2000)
@Alternative
public class PriorityGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hey " + name + " I should be selected since I've got the highest priority !";
    }
}
