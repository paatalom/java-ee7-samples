package cu.edu.java.ee7.jms.send.receive.simple;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;

import cu.edu.java.ee7.jms.send.receive.Resources;

@Stateless
public class MessageSenderSync {

    @Inject
//    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    JMSContext context;
    
    @Resource(mappedName=Resources.SYNC_CONTAINER_MANAGED_QUEUE)
    Queue syncQueue;

    public void sendMessage(String message) {
        context.createProducer().send(syncQueue, message);
    }
}
