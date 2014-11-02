package cu.edu.java.ee7.ejb.stateless.remote;

import javax.ejb.Stateless;

@Stateless
public class AccountSessionBeanWithInterface implements Account {

    @Override
    public String withdraw(float amount) {
        return "Withdrawn: " + amount;
    }

    @Override
    public String deposit(float amount) { 
        return "Deposited: " + amount;
    }
}
