package cu.edu.java.ee7.cdi.vetoed;

public class FancyGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hi " + name + " :)";
    }
}
