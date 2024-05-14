package com.prodapt.restapiexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.restapiexample.entities.Person;
import com.prodapt.restapiexample.exceptions.PersonNotFoundException;
import com.prodapt.restapiexample.service.PersonService;

@RestController
@RequestMapping("/api/v1/person/")
public class PersonController {

	@Autowired
	private PersonService service;

	// Passing data in request body in JSON format
	// URL : http://localhost:8081/api/v1/person/addperson
	@PostMapping("/addperson")
	public Person addPerson(@RequestBody Person person) {
		Person p = service.addPerson(person);
		return p;
	}

	// Passing data as Request Parameter
	// URL : http://localhost:8081/api/v1/person/getperson?id=1
	@GetMapping("/getperson")
	public Person getPerson(@RequestParam("id") Integer personId) throws PersonNotFoundException {
		Person p = service.getPersonById(personId);
		return p;
	}
}
