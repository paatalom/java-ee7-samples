package cu.edu.java.ee7.cdi.interceptors.priority;

@MyInterceptorBinding
public class SimpleGreeting implements Greeting {

    private String greet;

    @Override
    public String getGreet() {
        return greet;
    }

    @Override
    public void setGreet(String greet) {
        this.greet = greet;
    }
}
