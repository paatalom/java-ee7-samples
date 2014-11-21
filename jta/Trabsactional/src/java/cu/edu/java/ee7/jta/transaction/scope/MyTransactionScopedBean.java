package cu.edu.java.ee7.jta.transaction.scope;

import java.io.Serializable;
import javax.transaction.TransactionScoped;

@TransactionScoped
public class MyTransactionScopedBean implements Serializable {

    public String getId() {
        return this + "";
    }
}
