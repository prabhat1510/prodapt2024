package com.prodapt.restapiexample.service;

import com.prodapt.restapiexample.entities.Movie;
import com.prodapt.restapiexample.exceptions.MovieNotFoundException;

public interface MovieService {
	//Create
	public Movie createMovie(Movie movie);
	//Read by name
	public Movie getMovieByName(String name) throws MovieNotFoundException;
}
