package cu.edu.java.ee7.jpa.unsynchronized.pc;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;

@Stateless
public class EmployeeBean {

    @PersistenceContext(synchronization = SynchronizationType.UNSYNCHRONIZED)
    EntityManager em;
    
    public void persistWithoutJoin(Employee e) {
        em.persist(e);
    }
    
    public void persistWithJoin(Employee e) {
        em.joinTransaction();
        em.persist(e);
    }
    
    
    public List<Employee> get() {
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }
}
