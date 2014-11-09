package cu.edu.java.ee7.cdi.bean.discovery.annotated;

public class SimpleGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
    
}
