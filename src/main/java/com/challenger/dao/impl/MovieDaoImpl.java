package com.challenger.dao.impl;

import com.challenger.dao.MovieDao;
import com.challenger.model.Movie;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Author: David
 */

public class MovieDaoImpl extends HibernateDaoSupport implements MovieDao {

    public void save(Movie movie){
        getHibernateTemplate().save(movie);
    }

    public void update(Movie movie){
        getHibernateTemplate().update(movie);
    }

    public void delete(Movie movie){
        getHibernateTemplate().delete(movie);
    }

    public Movie findByMovieTitle(String title){
        List list = getHibernateTemplate().find("from movie where title=?", title);
        return (Movie)list.get(0);
    }

    public List<Movie> findAllMovies() {
        List<Movie> movieList = getHibernateTemplate().loadAll(Movie.class);
        return movieList;
    }


}
