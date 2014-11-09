package cu.edu.java.ee7.cdi.scopes;

import javax.inject.Singleton;

@Singleton
public class MySingletonScopedBean {

    public String getID() {
        return this + "";
    }
}
