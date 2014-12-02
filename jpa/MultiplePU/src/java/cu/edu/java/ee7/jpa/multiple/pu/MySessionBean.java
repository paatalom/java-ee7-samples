package cu.edu.java.ee7.jpa.multiple.pu;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class MySessionBean {

    @PersistenceContext(unitName = "samplePU")
    EntityManager sampleDB1;

    @PersistenceContext(unitName = "samplePU1")
    EntityManager sampleDB2;

    public List<Movie> listMovies() {
        return sampleDB1.createNamedQuery("Movie.findAll", Movie.class).getResultList();
    }
    
    public List<ProductCode> listProductCode() {
        return sampleDB2.createNamedQuery("ProductCode.findAll", ProductCode.class).getResultList();
    }

}
