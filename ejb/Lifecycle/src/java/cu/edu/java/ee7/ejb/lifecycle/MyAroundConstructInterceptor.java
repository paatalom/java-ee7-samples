package cu.edu.java.ee7.ejb.lifecycle;

import javax.annotation.Priority;
import javax.interceptor.AroundConstruct;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Priority(Interceptor.Priority.APPLICATION+10)
@Interceptor
@MyAroundConstructInterceptorBinding
public class MyAroundConstructInterceptor {
    
    @AroundConstruct
    public void validateConstructor(InvocationContext context) {
        System.out.println("MyAroundConstructInterceptor.validateConstructor");
    }
}
