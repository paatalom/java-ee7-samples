package cu.edu.java.ee7.cdi.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
public class FancyGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Nice to meet you, hello " + name;
    }
}
