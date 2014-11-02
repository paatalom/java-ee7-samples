package cu.edu.java.ee7.ejb.stateless;

import javax.ejb.Stateless;

@Stateless
public class AccountSessionBean {

    private float amount = 0;

    public String withdraw(float amount) {
        this.amount -= amount;
        return "Withdrawn: " + amount;
    }

    public String deposit(float amount) {
        this.amount += amount;
        return "Deposited: " + amount;
    }

    public float getAmount() {
        return this.amount;
    }
}
