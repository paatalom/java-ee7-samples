package cu.edu.java.ee7.cdi.scopes;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyApplicationScopedBean {

    public String getID() {
        return this + "";
    }
}
