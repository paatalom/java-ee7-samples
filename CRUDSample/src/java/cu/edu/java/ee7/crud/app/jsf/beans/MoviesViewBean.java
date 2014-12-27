/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.java.ee7.crud.app.jsf.beans;

/**
 *
 * @author paata1
 */
import cu.edu.java.ee7.crud.app.jpa.Movie;
import cu.edu.java.ee7.crud.app.jpa.MovieFascadeBean;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MoviesViewBean")
@ViewScoped
public class MoviesViewBean implements Serializable {

    @EJB
    MovieFascadeBean bean;

    private Movie selectedMovie;

    public List<Movie> getMovies() {
        return bean.listMovies();
    }

    public Movie getSelectedMovie() {
        return selectedMovie;
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }

    public String deleteMovie() {
        
        FacesContext context = FacesContext.getCurrentInstance();
        if (context == null) {
            return "home";
        }
        ExternalContext exContext = context.getExternalContext();
        if (exContext == null) {
            return "home";
        }
        Map<String, String> paramsMap = exContext.getRequestParameterMap();
        if (paramsMap == null || paramsMap.isEmpty()) {
            return "home";
        }
        String value = paramsMap.get("recordId");
        if (value == null) {
            return "home";
        }
        Integer movieId = new Integer(value);
        bean.deleteMovie(movieId);
        return "home";
    }
}
