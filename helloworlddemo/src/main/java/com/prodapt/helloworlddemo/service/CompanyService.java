package com.prodapt.helloworlddemo.service;

import java.util.List;

import com.prodapt.helloworlddemo.entities.CompanyDTO;
import com.prodapt.helloworlddemo.exceptions.CompanyNotFoundException;
import com.prodapt.helloworlddemo.exceptions.NoRecordFoundException;

public interface CompanyService {
	//Create
	public String createCompany(CompanyDTO companyDTO);
	
	//Retrieve 
	public CompanyDTO getCompanyById(Integer companyId) throws CompanyNotFoundException;
	
	//Retrieve All
	public List<CompanyDTO> companies() throws NoRecordFoundException;
	
	//Delete 
	public String deleteCompanyById(Integer companyId) throws CompanyNotFoundException;
	
	//Update
	public CompanyDTO updateCompany(CompanyDTO companyDTO) throws CompanyNotFoundException;
	
	//Get CompanyDTO By Name
	public List<CompanyDTO>  getCompanyByName(String name) throws CompanyNotFoundException; 
	
	//Get CompanyDTO By City
	public List<CompanyDTO> getCompanyByCity(String city) throws NoRecordFoundException; 
}
