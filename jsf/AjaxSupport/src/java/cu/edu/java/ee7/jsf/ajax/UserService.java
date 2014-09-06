package cu.edu.java.ee7.jsf.ajax;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class UserService implements Serializable {
    @Inject User user;
    
    public void register() {
        System.out.println("Registering " + user.getName() + " with the password \"" + user.getPassword() + "\"");
    }
}
