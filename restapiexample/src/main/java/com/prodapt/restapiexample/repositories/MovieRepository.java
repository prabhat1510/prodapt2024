package com.prodapt.restapiexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restapiexample.entities.Actor;
import com.prodapt.restapiexample.entities.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
	public Movie findByName(String name);
}
