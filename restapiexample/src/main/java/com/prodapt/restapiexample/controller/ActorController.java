package com.prodapt.restapiexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.restapiexample.entities.Actor;
import com.prodapt.restapiexample.exceptions.ActorNotFoundException;
import com.prodapt.restapiexample.service.ActorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/movieapp")
@Tag(name="Movie APP Actor API")
public class ActorController {
	// Get the SLF4J logger interface, default Logback, a SLF4J implementation
	private static final Logger logger = LoggerFactory.getLogger(ActorController.class);
	private static final String SERVICE_MESSAGE="Call to service layer method is success";
	@Autowired
	private ActorService service;
	
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "302", description = "Found Actor"),
			  @ApiResponse(responseCode = "400", description = "Bad request"),
			  @ApiResponse(responseCode = "500", description = "Server Error")})
	@Operation(summary = "Find Actor by Name")
	@GetMapping("/actor")
	public ResponseEntity<Actor> getActorByName(@RequestParam("aname") String name) throws ActorNotFoundException {
		logger.info("Inside getActorByName +"+ ActorController.class.getName());
		Actor actor = service.getActorByName(name);
		logger.info(SERVICE_MESSAGE);
		return new ResponseEntity<Actor>(actor, HttpStatus.FOUND);
	}
	
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "201", description = "Created Actor"),
			  @ApiResponse(responseCode = "400", description = "Bad request"),
			  @ApiResponse(responseCode = "500", description = "Server Error")})
	@Operation(summary = "Create Actor in Movie APP")
	@PostMapping("/addactor")
	public ResponseEntity<Actor> addActor(@RequestBody Actor actor){
		logger.info("Inside addActor +"+ ActorController.class.getName());
		Actor act = service.createActor(actor);
		logger.info(SERVICE_MESSAGE);
		return new ResponseEntity<Actor>(act, HttpStatus.CREATED);
	}
	
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "302", description = "Found Actor"),
			  @ApiResponse(responseCode = "400", description = "Bad request"),
			  @ApiResponse(responseCode = "500", description = "Server Error")})
	@Operation(summary = "Find Actor by Id")
	@GetMapping("/actor/{id}")
	public ResponseEntity<Actor> getActorById(@PathVariable("id") Integer actorId) throws ActorNotFoundException {
		logger.info("Inside getActorById "+ ActorController.class.getName());
		Actor actor = service.getActorById(actorId);
		logger.info(SERVICE_MESSAGE);
		return new ResponseEntity<Actor>(actor, HttpStatus.FOUND);
	}
}
