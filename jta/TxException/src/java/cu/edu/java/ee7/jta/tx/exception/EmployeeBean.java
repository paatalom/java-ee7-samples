package cu.edu.java.ee7.jta.tx.exception;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class EmployeeBean {
    @PersistenceContext
    EntityManager em;
    
    @Transactional
    public void addAndThrowChecked() throws Exception {
        em.persist(new Employee(8, "Pavle"));
        throw new Exception();
    }
    
    @Transactional
    public void addAndThrowRuntime() {
        em.persist(new Employee(9, "Ivane"));
        throw new RuntimeException();
    }
    
    @Transactional
    public void addNoException() {
        em.persist(new Employee(10, "Petre"));
    }
    
    public List<Employee> getEmployees() {
        System.out.println("getEmployees");
        return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
    }
}
