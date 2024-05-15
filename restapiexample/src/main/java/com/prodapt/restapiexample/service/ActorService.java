package com.prodapt.restapiexample.service;

import com.prodapt.restapiexample.entities.Actor;
import com.prodapt.restapiexample.exceptions.ActorNotFoundException;

public interface ActorService {
	// Create
	public Actor createActor(Actor actor);

	// Read by name
	public Actor getActorByName(String name) throws ActorNotFoundException;

	// Read by id
	public Actor getActorById(Integer actorId) throws ActorNotFoundException;
}
