package com.challenger.dao;

import com.challenger.model.Movie;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: David
 */

@Component
public interface MovieDao {
    public void save(Movie movie);
    public void update(Movie movie);
    public void delete(Movie movie);
    public Movie findByMovieTitle(String title);
    public List<Movie> findAllMovies();
}
