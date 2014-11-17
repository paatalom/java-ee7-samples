package cu.edu.java.ee7.concurrency.managedexecutor;

public class MyRunnableTask implements Runnable {

    @Override
    public void run() {
        TestStatus.latch.countDown();
    }
}
