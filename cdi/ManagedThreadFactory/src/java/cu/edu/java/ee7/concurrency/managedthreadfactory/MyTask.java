package cu.edu.java.ee7.concurrency.managedthreadfactory;

public class MyTask implements Runnable {
    private int id;

    public MyTask(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            System.out.println("Running Task: " + id);
            
            Thread.sleep(5000);
            
            System.out.println("Running Task 1.: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
