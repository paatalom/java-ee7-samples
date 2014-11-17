package cu.edu.java.ee7.concurrency.managedscheduledexecutor;

public class MyRunnableTask implements Runnable {

    private int id;

    public MyRunnableTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Running Runnable Task: " + id);
    }
}
