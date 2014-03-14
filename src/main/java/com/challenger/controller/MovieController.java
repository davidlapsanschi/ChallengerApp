package com.challenger.controller;

import com.challenger.dao.MovieDao;
import com.challenger.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MovieController {

    @Qualifier("movieDao")
    @Autowired
    private MovieDao movieDao;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public String printMovieList(ModelMap model) {
        List<Movie> movieList = movieDao.findAllMovies();
        model.addAttribute("movieList", movieList);
        return "movieList";
    }

    @RequestMapping(value = "/movies/saveMovie", method = RequestMethod.POST)
    public View saveMovies(@ModelAttribute Movie movie, ModelMap model) {
        movieDao.save(movie);
        return new RedirectView("/movies");
    }
}