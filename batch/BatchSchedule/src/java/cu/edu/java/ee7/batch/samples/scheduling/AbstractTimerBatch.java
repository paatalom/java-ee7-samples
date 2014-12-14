package cu.edu.java.ee7.batch.samples.scheduling;

import javax.batch.runtime.BatchRuntime;
import javax.ejb.Schedule;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public abstract class AbstractTimerBatch {
    
    public static List<Long> executedBatchs = new ArrayList<>();

    @Schedule(hour = "*", minute = "*", second = "*/10")
    public void myJob() {
        executedBatchs.add(BatchRuntime.getJobOperator().start("myJob", new Properties()));
        afterRun();
    }

    protected void afterRun() {}
}
