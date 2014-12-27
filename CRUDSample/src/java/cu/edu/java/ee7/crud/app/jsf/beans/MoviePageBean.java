/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.java.ee7.crud.app.jsf.beans;

import cu.edu.java.ee7.crud.app.jpa.Movie;
import cu.edu.java.ee7.crud.app.jpa.MovieFascadeBean;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.ExternalContext;
import java.util.Map;

@ManagedBean(name = "moviePageBean")
@ViewScoped
public class MoviePageBean implements Serializable {

    @EJB
    MovieFascadeBean bean;

    private Integer movieId;
    private String movie;
    private String actors;

    /**
     * Creates a new instance of MoviePageBean
     */
    @PostConstruct
    public void init() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (context == null) {
            return;
        }
        ExternalContext exContext = context.getExternalContext();
        if (exContext == null) {
            return;
        }
        Map<String, String> paramsMap = exContext.getRequestParameterMap();
        if (paramsMap == null || paramsMap.isEmpty()) {
            return;
        }
        String value = paramsMap.get("recordId");
        if (value == null) {
            return;
        }
        movieId = new Integer(value);
        Movie movieR = bean.getMovie(movieId);
        movie = movieR.getName();
        actors = movieR.getActors();
    }

    public String getActors() {
        return actors;
    }

    public String getMovie() {
        return movie;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
    
     public String saveMovie(){
        
        Movie movieObj = new Movie();
        movieObj.setId(movieId);
        movieObj.setActors(actors);
        movieObj.setName(movie);
        
        bean.addOrUpdateMovie(movieObj);
        return "home";
    }
}
