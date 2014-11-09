package cu.edu.java.ee7.cdi.decorators;

public class SimpleGreeting implements Greeting {
    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}
