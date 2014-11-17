package cu.edu.java.ee7.concurrency.dynamicproxy;

public class MyRunnableWork implements Runnable , MyWork {

    @Override
    public void run() {
        System.out.println("MyRunnableWork.run");
    }

    @Override
    public void myWork() {
        System.out.println("MyRunnablework.myWork");
    }
}
