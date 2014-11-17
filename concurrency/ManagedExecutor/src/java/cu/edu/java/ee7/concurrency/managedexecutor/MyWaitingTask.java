package cu.edu.java.ee7.concurrency.managedexecutor;

public class MyWaitingTask implements Runnable {

    @Override
    public void run() {
        System.out.println("MyWaitingTask.run");
    }
    
}
