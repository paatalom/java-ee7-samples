package org.javaee7.cdi.bean.discovery.all;

public class SimpleGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
    
}
