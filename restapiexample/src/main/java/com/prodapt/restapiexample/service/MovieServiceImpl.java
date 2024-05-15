package com.prodapt.restapiexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.restapiexample.entities.Movie;
import com.prodapt.restapiexample.exceptions.MovieNotFoundException;
import com.prodapt.restapiexample.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	// Get the SLF4J logger interface, default Logback, a SLF4J implementation
    private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);
	
	@Autowired
	private MovieRepository repo;
	@Override
	public Movie createMovie(Movie movie) {
		logger.info("Saving movie");
		return repo.save(movie);
	}

	@Override
	public Movie getMovieByName(String name) throws MovieNotFoundException {
		Movie movie = repo.findByName(name);
		if(movie != null) {
			logger.info("Movie "+name+" exists in record");
			return movie;
		}else {
			logger.error("Movie "+name+" doesn't exists");
			throw new MovieNotFoundException("Movie "+name+"doesn't exists");
		}
	}

}
