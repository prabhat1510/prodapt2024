package com.prodapt.restapiexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.restapiexample.entities.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
