package cu.edu.java.ee7.concurrency.managedexecutor;

import java.io.Serializable;

@javax.transaction.TransactionScoped
public class MyTransactionScopedBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public boolean isInTx() {
       return true;
    }
}
