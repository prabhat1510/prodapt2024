package com.prodapt.helloworlddemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.helloworlddemo.entities.CompanyDTO;

@Repository
public interface CompanyRepository extends CrudRepository<CompanyDTO, Integer>{

	public List<CompanyDTO> findByName(String name);
	public List<CompanyDTO> findByCity(String city);
}
