package cu.edu.java.ee7.batch.multiple.steps;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class MyBatchlet extends AbstractBatchlet {

    @Override
    public String process() {
        System.out.println("Running inside a batchlet");
        
        return "COMPLETED";
    }

}
