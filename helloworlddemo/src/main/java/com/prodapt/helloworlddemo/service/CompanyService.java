package com.prodapt.helloworlddemo.service;

import java.util.List;

import com.prodapt.helloworlddemo.entities.Company;
import com.prodapt.helloworlddemo.exceptions.CompanyNotFoundException;
import com.prodapt.helloworlddemo.exceptions.NoRecordFoundException;

public interface CompanyService {
	//Create
	public String createCompany(Company company);
	
	//Retrieve 
	public Company getCompanyById(Integer companyId) throws CompanyNotFoundException;
	
	//Retrieve All
	public List<Company> companies() throws NoRecordFoundException;
	
	//Delete 
	public String deleteCompanyById(Integer companyId) throws CompanyNotFoundException;
	
	//Update
	public Company updateCompany(Company company) throws CompanyNotFoundException;
	
	//Get Company By Name
	public List<Company>  getCompanyByName(String name) throws CompanyNotFoundException; 
	
	//Get Company By City
	public List<Company> getCompanyByCity(String city) throws NoRecordFoundException; 
}
