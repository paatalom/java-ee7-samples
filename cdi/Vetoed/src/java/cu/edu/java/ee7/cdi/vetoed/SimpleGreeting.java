package cu.edu.java.ee7.cdi.vetoed;

import javax.enterprise.inject.Vetoed;

@Vetoed
public class SimpleGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
