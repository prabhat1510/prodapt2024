package com.prodapt.restapiexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.restapiexample.entities.Movie;
import com.prodapt.restapiexample.exceptions.MovieNotFoundException;
import com.prodapt.restapiexample.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/movieapp")
@Tag(name="Movie APP Movie API")
public class MovieController {
	// Get the SLF4J logger interface, default Logback, a SLF4J implementation
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	@Autowired
	private MovieService service;

	@Operation(summary = "Find Movie by Name")
	@GetMapping("/movie")
	public ResponseEntity<Movie> getMovieByName(@RequestParam("mname") String name) throws MovieNotFoundException {
		logger.info("Inside getMovieByName +"+ MovieController.class.getName());
		Movie movie = service.getMovieByName(name);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<>(movie, HttpStatus.FOUND);
	}
	
	@Operation(summary = "Add Movie in App")
	@PostMapping("/addmovie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		logger.info("Inside addMovie +"+ MovieController.class.getName());
		Movie mov = service.createMovie(movie);
		logger.info("Call to service layer method is success");
		return new ResponseEntity<Movie>(mov, HttpStatus.CREATED);
	}
}
