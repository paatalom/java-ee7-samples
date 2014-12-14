package cu.edu.java.ee7.batch.samples.scheduling;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.BatchStatus;
import javax.inject.Named;

@Named
public class MyBatchlet extends AbstractBatchlet {
    @Override
    public String process() {
        System.out.println("Running inside a batchlet");

        return BatchStatus.COMPLETED.toString();
    }
}
