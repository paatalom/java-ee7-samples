package cu.edu.java.ee7.jpa.storedprocedure;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class MySessionBean {

    @PersistenceContext(unitName = "samplePU")
    EntityManager sampleDB1;

    public List<Movie> listMovies() {
        List<Movie> movies = sampleDB1.createNamedStoredProcedureQuery("mySP").setParameter("rownum", 0).getResultList();
        return movies;
    }
}
