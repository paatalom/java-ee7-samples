package cu.edu.java.ee7.crud.app.jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class MovieFascadeBean {

    @PersistenceContext(unitName = "samplePU")
    EntityManager sampleDB1;

    public List<Movie> listMovies() {
        return sampleDB1.createNamedQuery("Movie.findAll", Movie.class).getResultList();
    }

    public Movie getMovie(Integer movieId) {
        return sampleDB1.find(Movie.class, movieId);
    }

    public void addOrUpdateMovie(Movie movie) {
        if (movie == null) {
            return;
        }
        if (movie.getId() == null) {
            sampleDB1.persist(movie);
        } else {
            sampleDB1.merge(movie);
        }
    }

    public void deleteMovie(Integer movieId) {
        sampleDB1.remove(sampleDB1.find(Movie.class, movieId));
    }
}
