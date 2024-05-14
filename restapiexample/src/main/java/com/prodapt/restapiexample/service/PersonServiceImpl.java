package com.prodapt.restapiexample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.restapiexample.entities.Person;
import com.prodapt.restapiexample.exceptions.PersonNotFoundException;
import com.prodapt.restapiexample.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

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
			return person.get();
		}else {
			throw new PersonNotFoundException("Person with personId "+personId+"doesn't exists");
		}
		
	}

}
