package cu.edu.java.ee7.cdi.bean.discovery.none;

public class FancyGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name + ":)";
    }
    
}
