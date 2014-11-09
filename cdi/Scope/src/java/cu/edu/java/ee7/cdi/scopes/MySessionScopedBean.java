package cu.edu.java.ee7.cdi.scopes;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class MySessionScopedBean implements Serializable {

    public String getID() {
        return this + "";
    }
}
