package cu.edu.java.ee7.concurrency.managedexecutor;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<Product> {

    private int id;
    
    public MyCallableTask(int id) {
        this.id = id;
    }
    
    @Override
    public Product call() {
        TestStatus.latch.countDown();
        return new Product(id);
    }
}
