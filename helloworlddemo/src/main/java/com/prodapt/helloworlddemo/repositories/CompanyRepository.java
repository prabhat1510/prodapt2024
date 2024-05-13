package com.prodapt.helloworlddemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.helloworlddemo.entities.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer>{

	public List<Company> findByName(String name);
	public List<Company> findByCity(String city);
}
