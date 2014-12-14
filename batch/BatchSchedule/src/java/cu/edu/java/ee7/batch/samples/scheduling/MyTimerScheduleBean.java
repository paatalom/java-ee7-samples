package cu.edu.java.ee7.batch.samples.scheduling;

import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class MyTimerScheduleBean extends AbstractTimerBatch {}
