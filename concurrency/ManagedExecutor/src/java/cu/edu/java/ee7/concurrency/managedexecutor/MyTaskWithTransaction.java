package cu.edu.java.ee7.concurrency.managedexecutor;

import javax.inject.Inject;
import javax.transaction.Transactional;

public class MyTaskWithTransaction implements Runnable {

    private int id;
    @Inject MyTransactionScopedBean bean;

    public MyTaskWithTransaction() {
    }

    public MyTaskWithTransaction(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    @Transactional
    public void run() {
        // a Call to a TX Scoped bean should fail if outside a tx
        try {
           TestStatus.foundTransactionScopedBean = bean.isInTx();
        }
        catch(Exception e) {
           e.printStackTrace();
        }
        TestStatus.latch.countDown();
    }

}
