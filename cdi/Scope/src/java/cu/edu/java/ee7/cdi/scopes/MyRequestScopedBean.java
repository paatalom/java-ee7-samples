package cu.edu.java.ee7.cdi.scopes;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MyRequestScopedBean {

    public String getID() {
        return this + "";
    }
}
