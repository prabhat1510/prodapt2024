package com.prodapt.restapiexample.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.restapiexample.entities.Actor;
import com.prodapt.restapiexample.exceptions.ActorNotFoundException;
import com.prodapt.restapiexample.repositories.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService {
	// Get the SLF4J logger interface, default Logback, a SLF4J implementation
    private static final Logger logger = LoggerFactory.getLogger(ActorServiceImpl.class);

	@Autowired
	private ActorRepository repo;
	@Override
	public Actor createActor(Actor actor) {
		return repo.save(actor);
		//return null;
	}

	@Override
	public Actor getActorByName(String name) throws ActorNotFoundException {
		Actor actor = repo.findByName(name);
		if(actor != null) {
			logger.info("Actor "+name+" exists in record");
			return actor;
		}else {
			logger.error("Actor "+name+" doesn't exists");
			throw new ActorNotFoundException("Actor "+name+"doesn't exists");
		}
	}

	@Override
	public Actor getActorById(Integer actorId) throws ActorNotFoundException {
		Optional<Actor> actor = repo.findById(actorId);
		if(actor.isPresent()) {
			logger.info("Actor "+actorId+" exists in record");
			return actor.get();
		}else {
			logger.error("Actor "+actorId+" doesn't exists");
			throw new ActorNotFoundException("Actor "+actorId+"doesn't exists");
		}
	}

}
