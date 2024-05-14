package com.prodapt.restapiexample.service;

import com.prodapt.restapiexample.entities.Person;
import com.prodapt.restapiexample.exceptions.PersonNotFoundException;

public interface PersonService {
	//Create
	public Person addPerson(Person person);
	//Retrieve
	public Person getPersonById(Integer personId) throws PersonNotFoundException;
	
}
