package cu.edu.java.ee7.servlets.nonblockingio;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.AsyncContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;

public class MyWriteListener implements WriteListener {

    private ServletOutputStream output = null;
    private AsyncContext context = null;

    public MyWriteListener(ServletOutputStream out, AsyncContext ac) {
        this.output = out;
        this.context = ac;
    }

    @Override
    public void onWritePossible() {
        if (output.isReady()) {
            try {
                output.write("Asynchronous Data Output".getBytes());
                context.complete();
            } catch (IOException ex) {
                Logger.getLogger(MyWriteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
        context.complete();
    }
}
