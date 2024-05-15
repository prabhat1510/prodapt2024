package com.prodapt.restapiexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restapiexample.entities.Actor;

@Repository
public interface ActorRepository extends CrudRepository<Actor, Integer> {
	public Actor findByName(String name);
}
