package cu.edu.java.ee7.ejb.singleton;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class MySingletonBeanManagedConcurrency {
    
    volatile StringBuilder builder;

    @PostConstruct
    private void postConstruct() {
        builder = new StringBuilder();
        System.out.println("postConstruct");
    }

    public String readSomething() {
        return "current timestamp: "+ new Date();
    }

    public String writeSomething(String something) {
        synchronized (builder) {
            builder.append(something);
        }
        return builder.toString() + " : " + new Date();
    }
}
