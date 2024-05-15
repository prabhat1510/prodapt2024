package com.prodapt.restapiexample.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.restapiexample.entities.Person;
import com.prodapt.restapiexample.exceptions.PersonNotFoundException;
import com.prodapt.restapiexample.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	 // Get the SLF4J logger interface, default Logback, a SLF4J implementation
    private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@Autowired
	private PersonRepository repo;
	@Override
	public Person addPerson(Person person) {
		return repo.save(person);
	}

	@Override
	public Person getPersonById(Integer personId) throws PersonNotFoundException {
		Optional<Person> person = repo.findById(personId);
		if(person.isPresent()) {
			logger.info("Person with person id "+personId+" exists in record");
			return person.get();
		}else {
			logger.error("Person with personId "+personId+"doesn't exists");
			throw new PersonNotFoundException("Person with personId "+personId+"doesn't exists");
		}
		
	}

}
