package cu.edu.java.ee7.concurrency.managedexecutor;

import java.util.concurrent.CountDownLatch;

public class TestStatus {
    public static CountDownLatch latch;
    public static boolean foundTransactionScopedBean;
}
