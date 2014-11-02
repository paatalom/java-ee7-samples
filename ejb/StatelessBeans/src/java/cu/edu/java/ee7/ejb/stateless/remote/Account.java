package cu.edu.java.ee7.ejb.stateless.remote;

import javax.ejb.Remote;

@Remote
public interface Account {

    public String withdraw(float amount);

    public String deposit(float amount);

}
