package com.prodapt.restapiexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restapiexample.entities.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}
